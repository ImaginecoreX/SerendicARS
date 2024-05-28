package icx.application.main.sub;

import com.formdev.flatlaf.FlatClientProperties;
import icx.table.TableButtonCellRenderer;
import icx.table.header.TableCheckBoxHeaderRenderer;
import icx.table.TableContentCenterCellRenderer;
import icx.table.TableSwitchButtonCellEditor;
import icx.table.TableSwitchButtonCellRenderer;
import icx.table.header.TableButtonHeaderRenderer;
import icx.util.ImageScaler;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import icx.loggers.PassengerLogger;
import icx.loggers.DatabaseLogger;
import icx.model.MySQL;
import icx.model.PassengerIMPL;
import icx.service.impl.PassengerSeviceIMPL;
import icx.util.Constants;
import icx.util.DateFormatter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author sandaruwan
 */
public class FormPassenger extends javax.swing.JPanel {

    private PassengerSeviceIMPL passengerSeviceIMPL = new PassengerSeviceIMPL();

    public FormPassenger() {
        initComponents();
        init();
    }

    private void testData() {
        DefaultTableModel model = (DefaultTableModel) passengerTable.getModel();
        model.addRow(new Object[]{true, "Nsme", "ticket", "serial", "status", "Passport", "", true});
        model.addRow(new Object[]{false, "Nsme", "ticket", "serial", "status", "Passport", "", false});
        model.addRow(new Object[]{true, "Nsme", "ticket", "serial", "status", "Passport", "", true});
    }

    private void init() {
        styleComponents();
        renderTable();
        testData();
        loadPassengerTable();
        loadTotalPassengersToday();
        loadRecentFlightPassengers();
    }

    private void styleComponents() {
        title.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:$h1.font");
        JTextField[] fields = {destinationField, flightField, classField};
        for (JTextField field : fields) {
            field.putClientProperty("JTextField.leadingIcon", new ImageScaler().getSvgIcon("icx/icon/svg/search.svg", 20, 20));
            field.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Search");
        }

        JPanel[] panels = {destinationPanel, flightPanel, classPanel, recentFlightDetailPanel2, recentFlightDetailPanel3, recentFlightDetailPanel4, jPanel1, jPanel2, jPanel3};
        for (JPanel panel : panels) {
            panel.putClientProperty(FlatClientProperties.STYLE, ""
                    + "background:$SubPanel.background;"
                    + "arc:25;");
        }
        recentFlightDetailPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:lighten($SubPanel.background, 10%);"
                + "arc:25;");
        /*
         *  Hiding the JTable and JScrollPane doesn't work well;
         *
         *        JTable[] tables = {destinationTable, flightTable, classTable};
         *        for (JTable table : tables) {
         *            table.setVisible(false);
         *        }
         *
         *        JScrollPane[] containers = {destinationScroll, flightScroll, classScroll};
         *        for (JScrollPane container : containers) {
         *            container.setVisible(false);
         *        }
         */
        JPanel[] containers = {destinationContainer, flightContainer, classContainer};
        for (JPanel container : containers) {
            container.setVisible(false);
            container.putClientProperty(FlatClientProperties.STYLE, ""
                    + "background:$SubPanel.background;"
                    + "arc:20;");
        }
    }

    // Customizing Table Cells
    private void renderTable() {
        new TableContentCenterCellRenderer().renderTable(passengerTable);
        passengerTable.getColumnModel().getColumn(0).setHeaderRenderer(new TableCheckBoxHeaderRenderer(passengerTable, 0));

        passengerTable.getColumnModel().getColumn(6).setCellRenderer(new TableButtonCellRenderer("View", "", (int row) -> {
            System.out.println(row);
        }));

        passengerTable.getColumnModel().getColumn(6).setHeaderRenderer(new TableButtonHeaderRenderer(passengerTable, 6, "refresh", "icx/icon/svg/refresh.svg", () -> {
            reset();
        }));

        passengerTable.getColumnModel().getColumn(7).setHeaderRenderer(new TableButtonHeaderRenderer(passengerTable, 7, "Print Report", () -> {
            System.out.println("Print Report");
        }));

        passengerTable.getColumnModel().getColumn(7).setCellRenderer(new TableSwitchButtonCellRenderer());
        passengerTable.getColumnModel().getColumn(7).setCellEditor(new TableSwitchButtonCellEditor((boolean selected) -> {
            System.out.println(selected);
        }));
    }

    private void reset() {
        this.destination = "";
        this.className = "";
        this.flight = "";
        JPanel[] containers = {destinationContainer, flightContainer, classContainer};
        for (JPanel container : containers) {
            container.setVisible(false);
        }
        JTextField[] fields = {destinationField, flightField, classField};
        for (JTextField field : fields) {
            field.setText("");
        }
        loadPassengerTable();
    }

    /*
     * Data Loading
     */
    private void loadDestinations(String destination) {
        destinationContainer.setVisible(true);
        //destinationScroll.setVisible(true);
        //destinationTable.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) destinationTable.getModel();
        model.setRowCount(0);

        String query = "SELECT `code`, `city` FROM `airports`";
        if (!destination.isEmpty()) {
            query += " WHERE `city` LIKE '%" + destination + "%' "
                    + "OR `code` LIKE '%" + destination + "%'";
        }

        try {
            ResultSet resultSet = MySQL.execute(query);

            while (resultSet.next()) {
                Vector rowData = new Vector();

                rowData.add(resultSet.getString("city"));
                rowData.add(resultSet.getString("code"));

                model.addRow(rowData);
            }
        } catch (SQLException e) {
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Destination Search: " + e.getMessage(), e.getMessage());
        }
    }

    private void loadFlights(String flight) {
        flightContainer.setVisible(true);
        //flightScroll.setVisible(true);
        //flightField.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) flightTable.getModel();
        model.setRowCount(0);

        String query = "SELECT * FROM `flight_schedule` "
                + "INNER JOIN `flights` ON `flight_schedule`.`flight_id`=`flights`.`flight_id` "
                + "INNER JOIN `airlines` ON `flights`.`airline_id` = `airlines`.`airline_id` "
                + "INNER JOIN `airports` ON `flights`.`departure_airport_id`=`airports`.`airport_id`";
        //+ "INNER JOIN `airports` ON `flights`.`arrival_airport_id`=`airports`.`airport_id`";
        if (!flight.isEmpty()) {
            query += "  WHERE `flight_number` LIKE '%" + flight + "%' "
                    + "OR `airlines`.`name` LIKE '%" + flight + "%' "
                    + "OR `airports`.`name` LIKE '%" + flight + "%' "
                    + "OR `airports`.`code` LIKE '%" + flight + "%'";
        }

        try {
            ResultSet resultSet = MySQL.execute(query);

            while (resultSet.next()) {
                Vector rowData = new Vector();

                rowData.add(resultSet.getString("flight_number"));
                rowData.add(resultSet.getString("airports.name"));
                rowData.add(resultSet.getString("airports.code"));
                rowData.add(resultSet.getString("airlines.name"));

                model.addRow(rowData);
            }
        } catch (SQLException e) {
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Flight Search: " + e.getMessage(), e.getMessage());
        }
    }

    private void loadClasses(String className) {
        classContainer.setVisible(true);
        //classScroll.setVisible(true);
        //classTable.setVisible(true);

        DefaultTableModel model = (DefaultTableModel) classTable.getModel();
        model.setRowCount(0);

        String query = "SELECT `class_type` FROM `class`";
        if (!className.isEmpty()) {
            query += " WHERE `class_type` LIKE '%" + className + "%'";
        }

        try {
            ResultSet resultSet = MySQL.execute(query);

            while (resultSet.next()) {
                Vector rowData = new Vector();

                rowData.add(resultSet.getString("class_type"));

                model.addRow(rowData);
            }
        } catch (SQLException e) {
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Class Search: " + e.getMessage(), e.getMessage());
        }
    }

    /* Passenger Table */
    private String destination = "";
    private String flight = "";
    private String className = "";

    //private void loadPassengerTable(String destination, String flight, String className) {
    private void loadPassengerTable() {
        DefaultTableModel model = (DefaultTableModel) passengerTable.getModel();
        model.setRowCount(0);

        try {
            String query = "SELECT * FROM `ticket` "
                    + "INNER JOIN `passenger` ON `ticket`.`p_id` = `passenger`.`p_id` "
                    + "INNER JOIN `seat` ON `ticket`.`seat_s_id` = `seat`.`s_id` "
                    + "INNER JOIN `class` ON `seat`.`c_id` = `class`.`c_id` "
                    + "INNER JOIN `flight_schedule` ON `ticket`.`flight_schedule_id` = `flight_schedule`.`id` "
                    + "INNER JOIN `flights` ON `flight_schedule`.`flight_id` = `flights`.`flight_id` "
                    + "INNER JOIN `airports` ON `flights`.`arrival_airport_id` = `airports`.`airport_id`";

            if (!destination.isEmpty() || !flight.isEmpty() || !className.isEmpty()) {
                query += " WHERE";
                if (!flight.isEmpty()) {
                    query += " `flights`.`flight_number` = '" + flight + "'";
                    if (!className.isEmpty()) {
                        query += " AND `class_type`='" + className + "'";
                    }
                } else if (!destination.isEmpty()) {
                    query += " `airports`.`code` = '" + destination + "'";
                    if (!className.isEmpty()) {
                        query += " AND `class_type`='" + className + "'";
                    }
                } else if (!className.isEmpty()) {
                    query += " `class`.`class_type` = '" + className + "'";
                }
            }

            ResultSet resultSet = MySQL.execute(query);

            while (resultSet.next()) {
                Vector rowData = new Vector();

                rowData.add(false);
                rowData.add(resultSet.getString("passenger.fname") + " " + resultSet.getString("passenger.lname"));
                rowData.add(resultSet.getString("ticket.t_id"));
                rowData.add(resultSet.getString("seat.s_id") + " : " + resultSet.getString("class_type"));
                rowData.add(resultSet.getString("ticket.status"));
                rowData.add(resultSet.getString("passenger.passport_id"));
                rowData.add("");
                rowData.add(true);

                model.addRow(rowData);
            }
        } catch (SQLException e) {
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Search LoadPassengerTable: " + e.getMessage(), e.getMessage());
        }
    }

    private void loadTotalPassengersToday() {
        String date = new DateFormatter().formatDate(new Date());
        dateText.setText(date);

        try {
            ResultSet resultSet = MySQL.execute("SELECT COUNT(`flight_date`) AS `count`, `flight_date` FROM `ticket` "
                    + "INNER JOIN `flight_schedule` ON `ticket`.`flight_schedule_id` = `flight_schedule`.`id` "
                    + "INNER JOIN `flights` ON `flight_schedule`.`flight_id` = `flights`.`flight_id` "
                    + "WHERE `flight_date` = '" + date + "' "
                    + "GROUP BY `flight_date`");

            if (resultSet.next()) {
                count1.setText(resultSet.getString("count"));
                otherDetails1.setText("");
            }
        } catch (SQLException e) {
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Search loadTotalPassengersToday: " + e.getMessage(), e.getMessage());
        }
    }

    private void loadRecentFlightPassengers() {
        String date = new DateFormatter().formatDate(new Date());
        dateText.setText(date);

        try {
            ResultSet resultSet = MySQL.execute("SELECT COUNT(`flight_schedule_id`) AS `count`, `flight_schedule_id`, `flight_number` FROM `ticket` "
                    + "INNER JOIN `flight_schedule` ON `ticket`.`flight_schedule_id` = `flight_schedule`.`id` "
                    + "INNER JOIN `flights` ON `flight_schedule`.`flight_id` = `flights`.`flight_id` "
                    + "WHERE `flight_date`='" + date + "' "
                    + "GROUP BY `flight_schedule_id`"
                    + "LIMIT 3;");

            int count = 2;
            while (resultSet.next()) {
                try {
                    getRecentFlightPanelLabel(count, "flight").setText(resultSet.getString("flight_number"));
                    getRecentFlightPanelLabel(count, "count").setText(resultSet.getString("count"));
                    getRecentFlightPanelLabel(count, "other").setText("");
                    count++;
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException: " + e.getMessage());
                }
            }
            if (count <= 4) {
                for (int i = count; i <= 4; i++) {
                    RecentFlightsContainer.remove(getRecentFlightPanel(i));
                    SwingUtilities.updateComponentTreeUI(RecentFlightsContainer);
                    //getRecentFlightPanel(i).setVisible(false);
                }
            }
        } catch (SQLException e) {
            DatabaseLogger.logger.log(Level.SEVERE, "SQLException in Search loadTotalPassengersToday: \n" + e.getMessage(), e.getMessage());
        }
    }

    private JPanel getRecentFlightPanel(int panelNo) {
        if (panelNo == 2) {
            return recentFlightDetailPanel2;
        } else if (panelNo == 3) {
            return recentFlightDetailPanel3;
        } else if (panelNo == 4) {
            return recentFlightDetailPanel4;
        }
        return null;
    }

    private JLabel getRecentFlightPanelLabel(int panelNo, String labelName) {
        if (panelNo == 2) {
            switch (labelName) {
                case "flight":
                    return flight2;
                case "count":
                    return count2;
                case "other":
                    return otherDetails2;
            }
        } else if (panelNo == 3) {
            switch (labelName) {
                case "flight":
                    return flight3;
                case "count":
                    return count3;
                case "other":
                    return otherDetails3;
            }
        } else if (panelNo == 4) {
            switch (labelName) {
                case "flight":
                    return flight4;
                case "count":
                    return count4;
                case "other":
                    return otherDetails4;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        recentFlightsScroll = new javax.swing.JScrollPane();
        RecentFlightsContainer = new javax.swing.JPanel();
        recentFlightDetailPanel1 = new javax.swing.JPanel();
        dateHead = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        countHead1 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        otherDetails1 = new javax.swing.JLabel();
        recentFlightDetailPanel2 = new javax.swing.JPanel();
        flightHead2 = new javax.swing.JLabel();
        flight2 = new javax.swing.JLabel();
        countHead2 = new javax.swing.JLabel();
        count2 = new javax.swing.JLabel();
        otherDetails2 = new javax.swing.JLabel();
        recentFlightDetailPanel3 = new javax.swing.JPanel();
        flightHead3 = new javax.swing.JLabel();
        flight3 = new javax.swing.JLabel();
        countHead3 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        otherDetails3 = new javax.swing.JLabel();
        recentFlightDetailPanel4 = new javax.swing.JPanel();
        flightHead4 = new javax.swing.JLabel();
        flight4 = new javax.swing.JLabel();
        countHead4 = new javax.swing.JLabel();
        count4 = new javax.swing.JLabel();
        otherDetails4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        dashboardText = new javax.swing.JLabel();
        currentPanelText = new javax.swing.JLabel();
        headContainer = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        butonContainer = new javax.swing.JPanel();
        addPassengerButton = new javax.swing.JButton();
        updatePassengerButton = new javax.swing.JButton();
        deletePassengerButton = new javax.swing.JButton();
        searchPanelContainer = new javax.swing.JPanel();
        destinationPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        destinationContainer = new javax.swing.JPanel();
        destinationScroll = new javax.swing.JScrollPane();
        destinationTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        allDestinationsButton = new javax.swing.JButton();
        destinationField = new javax.swing.JTextField();
        flightPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        flightContainer = new javax.swing.JPanel();
        flightScroll = new javax.swing.JScrollPane();
        flightTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        allFlightsButton = new javax.swing.JButton();
        flightField = new javax.swing.JTextField();
        classPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        classContainer = new javax.swing.JPanel();
        classScroll = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        classField = new javax.swing.JTextField();
        allClassesButton = new javax.swing.JButton();
        passengerScroll = new javax.swing.JScrollPane();
        passengerTable = new javax.swing.JTable();
        moreButton = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));

        recentFlightsScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        recentFlightsScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        recentFlightsScroll.setPreferredSize(new java.awt.Dimension(820, 219));

        RecentFlightsContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        RecentFlightsContainer.setMinimumSize(new java.awt.Dimension(440, 270));
        RecentFlightsContainer.setPreferredSize(new java.awt.Dimension(900, 266));
        RecentFlightsContainer.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        recentFlightDetailPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentFlightDetailPanel1.setMinimumSize(new java.awt.Dimension(100, 0));

        dateHead.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        dateHead.setText("Date");

        dateText.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        dateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateText.setText("2024-05-17");

        countHead1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        countHead1.setText("Total Passengers:");

        count1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        count1.setText("150");

        otherDetails1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        otherDetails1.setText("Other Details");
        otherDetails1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout recentFlightDetailPanel1Layout = new javax.swing.GroupLayout(recentFlightDetailPanel1);
        recentFlightDetailPanel1.setLayout(recentFlightDetailPanel1Layout);
        recentFlightDetailPanel1Layout.setHorizontalGroup(
            recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(count1))
                            .addComponent(countHead1)
                            .addComponent(dateHead))
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        recentFlightDetailPanel1Layout.setVerticalGroup(
            recentFlightDetailPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateHead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateText)
                .addGap(18, 18, 18)
                .addComponent(countHead1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count1)
                .addGap(18, 18, 18)
                .addComponent(otherDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel1);

        recentFlightDetailPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentFlightDetailPanel2.setMinimumSize(new java.awt.Dimension(100, 0));

        flightHead2.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        flightHead2.setText("Flight: ");

        flight2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        flight2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flight2.setText("FlightName");

        countHead2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        countHead2.setText("Passenger Count:");

        count2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        count2.setText("100");

        otherDetails2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        otherDetails2.setText("Other Details");

        javax.swing.GroupLayout recentFlightDetailPanel2Layout = new javax.swing.GroupLayout(recentFlightDetailPanel2);
        recentFlightDetailPanel2.setLayout(recentFlightDetailPanel2Layout);
        recentFlightDetailPanel2Layout.setHorizontalGroup(
            recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(count2))
                            .addComponent(countHead2)
                            .addComponent(flightHead2))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addComponent(flight2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        recentFlightDetailPanel2Layout.setVerticalGroup(
            recentFlightDetailPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightHead2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flight2)
                .addGap(18, 18, 18)
                .addComponent(countHead2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count2)
                .addGap(18, 18, 18)
                .addComponent(otherDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel2);

        recentFlightDetailPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        recentFlightDetailPanel3.setMinimumSize(new java.awt.Dimension(100, 0));

        flightHead3.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        flightHead3.setText("Flight: ");

        flight3.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        flight3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flight3.setText("FlightName");

        countHead3.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        countHead3.setText("Passenger Count:");

        count3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        count3.setText("100");

        otherDetails3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        otherDetails3.setText("Other Details");

        javax.swing.GroupLayout recentFlightDetailPanel3Layout = new javax.swing.GroupLayout(recentFlightDetailPanel3);
        recentFlightDetailPanel3.setLayout(recentFlightDetailPanel3Layout);
        recentFlightDetailPanel3Layout.setHorizontalGroup(
            recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherDetails3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(count3))
                            .addComponent(countHead3)
                            .addComponent(flightHead3))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addComponent(flight3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        recentFlightDetailPanel3Layout.setVerticalGroup(
            recentFlightDetailPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightHead3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flight3)
                .addGap(18, 18, 18)
                .addComponent(countHead3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count3)
                .addGap(18, 18, 18)
                .addComponent(otherDetails3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel3);

        recentFlightDetailPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        flightHead4.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        flightHead4.setText("Flight: ");

        flight4.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        flight4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        flight4.setText("FlightName");

        countHead4.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        countHead4.setText("Passenger Count:");

        count4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        count4.setText("100");

        otherDetails4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        otherDetails4.setText("Other Details");

        javax.swing.GroupLayout recentFlightDetailPanel4Layout = new javax.swing.GroupLayout(recentFlightDetailPanel4);
        recentFlightDetailPanel4.setLayout(recentFlightDetailPanel4Layout);
        recentFlightDetailPanel4Layout.setHorizontalGroup(
            recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                        .addComponent(otherDetails4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                        .addGroup(recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(count4))
                            .addComponent(countHead4)
                            .addComponent(flightHead4))
                        .addGap(0, 73, Short.MAX_VALUE))))
            .addComponent(flight4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        recentFlightDetailPanel4Layout.setVerticalGroup(
            recentFlightDetailPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentFlightDetailPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flightHead4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flight4)
                .addGap(18, 18, 18)
                .addComponent(countHead4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(count4)
                .addGap(18, 18, 18)
                .addComponent(otherDetails4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        RecentFlightsContainer.add(recentFlightDetailPanel4);

        recentFlightsScroll.setViewportView(RecentFlightsContainer);

        dashboardText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        dashboardText.setForeground(new java.awt.Color(0, 153, 255));
        dashboardText.setText("Dashboard");

        currentPanelText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        currentPanelText.setText("> Passenger Management");

        title.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        title.setText("Passenger Management");
        title.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 1, 0, 1));

        butonContainer.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        addPassengerButton.setBackground(new java.awt.Color(102, 153, 255));
        addPassengerButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        addPassengerButton.setText("Add Passenger");
        addPassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        addPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPassengerButtonActionPerformed(evt);
            }
        });
        butonContainer.add(addPassengerButton);

        updatePassengerButton.setBackground(new java.awt.Color(0, 153, 153));
        updatePassengerButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        updatePassengerButton.setText("Update Passenger");
        updatePassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        updatePassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePassengerButtonActionPerformed(evt);
            }
        });
        butonContainer.add(updatePassengerButton);

        deletePassengerButton.setBackground(new java.awt.Color(255, 51, 51));
        deletePassengerButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        deletePassengerButton.setText("Checkin");
        deletePassengerButton.setMargin(new java.awt.Insets(2, 5, 3, 5));
        butonContainer.add(deletePassengerButton);

        javax.swing.GroupLayout headContainerLayout = new javax.swing.GroupLayout(headContainer);
        headContainer.setLayout(headContainerLayout);
        headContainerLayout.setHorizontalGroup(
            headContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headContainerLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butonContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headContainerLayout.setVerticalGroup(
            headContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butonContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        destinationPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        destinationPanel.setMaximumSize(new java.awt.Dimension(32767, 250));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Select Destination");

        destinationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Destination", "Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        destinationTable.setShowHorizontalLines(true);
        destinationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destinationTableMouseClicked(evt);
            }
        });
        destinationScroll.setViewportView(destinationTable);
        if (destinationTable.getColumnModel().getColumnCount() > 0) {
            destinationTable.getColumnModel().getColumn(0).setResizable(false);
            destinationTable.getColumnModel().getColumn(1).setResizable(false);
            destinationTable.getColumnModel().getColumn(1).setPreferredWidth(30);
        }

        javax.swing.GroupLayout destinationContainerLayout = new javax.swing.GroupLayout(destinationContainer);
        destinationContainer.setLayout(destinationContainerLayout);
        destinationContainerLayout.setHorizontalGroup(
            destinationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(destinationScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        destinationContainerLayout.setVerticalGroup(
            destinationContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(destinationScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        allDestinationsButton.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        allDestinationsButton.setIcon(new ImageScaler().getSvgIcon("icx/icon/svg/refresh.svg", 24, 24)
        );
        allDestinationsButton.setText("View All");
        allDestinationsButton.setIconTextGap(2);
        allDestinationsButton.setMargin(new java.awt.Insets(2, 2, 3, 3));
        allDestinationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allDestinationsButtonActionPerformed(evt);
            }
        });

        destinationField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                destinationFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(destinationField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allDestinationsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(destinationField, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(allDestinationsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout destinationPanelLayout = new javax.swing.GroupLayout(destinationPanel);
        destinationPanel.setLayout(destinationPanelLayout);
        destinationPanelLayout.setHorizontalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(destinationContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(destinationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 141, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        destinationPanelLayout.setVerticalGroup(
            destinationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(destinationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(destinationContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        flightPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        flightPanel.setMaximumSize(new java.awt.Dimension(32767, 250));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("Select Flight");

        flightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight", "From", "Code", "Airline"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flightTable.setShowHorizontalLines(true);
        flightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightTableMouseClicked(evt);
            }
        });
        flightScroll.setViewportView(flightTable);
        if (flightTable.getColumnModel().getColumnCount() > 0) {
            flightTable.getColumnModel().getColumn(0).setResizable(false);
            flightTable.getColumnModel().getColumn(1).setResizable(false);
            flightTable.getColumnModel().getColumn(2).setResizable(false);
            flightTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            flightTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout flightContainerLayout = new javax.swing.GroupLayout(flightContainer);
        flightContainer.setLayout(flightContainerLayout);
        flightContainerLayout.setHorizontalGroup(
            flightContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(flightScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        flightContainerLayout.setVerticalGroup(
            flightContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(flightScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        allFlightsButton.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        allFlightsButton.setIcon(new ImageScaler().getSvgIcon("icx/icon/svg/refresh.svg", 24, 24)
        );
        allFlightsButton.setText("View All");
        allFlightsButton.setIconTextGap(2);
        allFlightsButton.setMargin(new java.awt.Insets(2, 2, 3, 3));
        allFlightsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allFlightsButtonActionPerformed(evt);
            }
        });

        flightField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                flightFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(flightField, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allFlightsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(allFlightsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(flightField, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout flightPanelLayout = new javax.swing.GroupLayout(flightPanel);
        flightPanel.setLayout(flightPanelLayout);
        flightPanelLayout.setHorizontalGroup(
            flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(flightContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(flightPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        flightPanelLayout.setVerticalGroup(
            flightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(flightContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        classPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
        classPanel.setMaximumSize(new java.awt.Dimension(32767, 250));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Select Class");

        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classTable.setShowHorizontalLines(true);
        classTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classTableMouseClicked(evt);
            }
        });
        classScroll.setViewportView(classTable);
        if (classTable.getColumnModel().getColumnCount() > 0) {
            classTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout classContainerLayout = new javax.swing.GroupLayout(classContainer);
        classContainer.setLayout(classContainerLayout);
        classContainerLayout.setHorizontalGroup(
            classContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(classScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        classContainerLayout.setVerticalGroup(
            classContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(classScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        classField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                classFieldKeyReleased(evt);
            }
        });

        allClassesButton.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        allClassesButton.setIcon(new ImageScaler().getSvgIcon("icx/icon/svg/refresh.svg", 24, 24)
        );
        allClassesButton.setText("View All");
        allClassesButton.setIconTextGap(2);
        allClassesButton.setMargin(new java.awt.Insets(2, 2, 3, 3));
        allClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allClassesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(classField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(classContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(classPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        classPanelLayout.setVerticalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(classContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout searchPanelContainerLayout = new javax.swing.GroupLayout(searchPanelContainer);
        searchPanelContainer.setLayout(searchPanelContainerLayout);
        searchPanelContainerLayout.setHorizontalGroup(
            searchPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelContainerLayout.createSequentialGroup()
                .addComponent(destinationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(flightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPanelContainerLayout.setVerticalGroup(
            searchPanelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destinationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(flightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(classPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        passengerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Passengers", "Ticket No", "Seat No/CI", "Status", "Passport No", "", "Print Report"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        passengerTable.setRowHeight(30);
        passengerTable.setShowGrid(false);
        passengerScroll.setViewportView(passengerTable);
        if (passengerTable.getColumnModel().getColumnCount() > 0) {
            passengerTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        moreButton.setBackground(Constants.TRANSPARENT);
        moreButton.setIcon(new FlatSVGIcon("icx/icon/svg/right_arrow.svg"));
        moreButton.setOpaque(true);
        moreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moreButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Onboard Passengers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(headContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passengerScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dashboardText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(currentPanelText))
                            .addComponent(recentFlightsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(recentFlightsScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(moreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dashboardText)
                    .addComponent(currentPanelText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passengerScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void moreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moreButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moreButtonActionPerformed

    private void destinationFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destinationFieldKeyReleased
        // Select Destination
        String destination = destinationField.getText();

        if (destination.isEmpty()) {
            destinationContainer.setVisible(false);
        } else {
            loadDestinations(destination);
        }
        this.destination = "";
        loadPassengerTable();
    }//GEN-LAST:event_destinationFieldKeyReleased

    private void flightFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flightFieldKeyReleased
        // Select Flight
        String flight = flightField.getText();
        if (flight.isEmpty()) {
            flightContainer.setVisible(false);
        } else {
            loadFlights(flight);
        }
        this.flight = "";
        loadPassengerTable();
    }//GEN-LAST:event_flightFieldKeyReleased

    private void classFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_classFieldKeyReleased
        // Select Class
        String className = classField.getText();
        if (className.isEmpty()) {
            classContainer.setVisible(false);
        } else {
            loadClasses(className);
        }
        this.className = "";
        loadPassengerTable();
    }//GEN-LAST:event_classFieldKeyReleased

    private void addPassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPassengerButtonActionPerformed
        // Open AddPassenger
        passengerSeviceIMPL.openAddPassenger(this);
    }//GEN-LAST:event_addPassengerButtonActionPerformed

    private void updatePassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePassengerButtonActionPerformed
        // Open ManagePassenger
        passengerSeviceIMPL.openManagePassenger(this);
    }//GEN-LAST:event_updatePassengerButtonActionPerformed

    private void allDestinationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allDestinationsButtonActionPerformed
        // View All Destination
        this.destination = "";
        loadPassengerTable();
        loadDestinations("");
    }//GEN-LAST:event_allDestinationsButtonActionPerformed

    private void allFlightsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allFlightsButtonActionPerformed
        // View All Flights
        this.flight = "";
        loadPassengerTable();
        loadFlights("");
    }//GEN-LAST:event_allFlightsButtonActionPerformed

    private void allClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allClassesButtonActionPerformed
        // View All Classes
        this.className = "";
        loadPassengerTable();
        loadClasses("");
    }//GEN-LAST:event_allClassesButtonActionPerformed

    private void destinationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationTableMouseClicked
        // Select Destination
        if (evt.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(evt)) {
            int selectedRow = destinationTable.getSelectedRow();

            if (selectedRow != -1) {
                this.destination = String.valueOf(destinationTable.getValueAt(selectedRow, 1));
                loadPassengerTable();
            }
        }
    }//GEN-LAST:event_destinationTableMouseClicked

    private void flightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightTableMouseClicked
        // Select Flight
        if (evt.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(evt)) {
            int selectedRow = flightTable.getSelectedRow();

            if (selectedRow != -1) {
                this.flight = String.valueOf(flightTable.getValueAt(selectedRow, 0));
                loadPassengerTable();
            }
        }
    }//GEN-LAST:event_flightTableMouseClicked

    private void classTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classTableMouseClicked
        // Select Class
        if (evt.getClickCount() == 2 && SwingUtilities.isLeftMouseButton(evt)) {
            int selectedRow = classTable.getSelectedRow();

            if (selectedRow != -1) {
                this.className = String.valueOf(classTable.getValueAt(selectedRow, 0));
                loadPassengerTable();
            }
        }
    }//GEN-LAST:event_classTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecentFlightsContainer;
    private javax.swing.JButton addPassengerButton;
    private javax.swing.JButton allClassesButton;
    private javax.swing.JButton allDestinationsButton;
    private javax.swing.JButton allFlightsButton;
    private javax.swing.JPanel butonContainer;
    private javax.swing.JPanel classContainer;
    private javax.swing.JTextField classField;
    private javax.swing.JPanel classPanel;
    private javax.swing.JScrollPane classScroll;
    private javax.swing.JTable classTable;
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JLabel count4;
    private javax.swing.JLabel countHead1;
    private javax.swing.JLabel countHead2;
    private javax.swing.JLabel countHead3;
    private javax.swing.JLabel countHead4;
    private javax.swing.JLabel currentPanelText;
    private javax.swing.JLabel dashboardText;
    private javax.swing.JLabel dateHead;
    private javax.swing.JLabel dateText;
    private javax.swing.JButton deletePassengerButton;
    private javax.swing.JPanel destinationContainer;
    private javax.swing.JTextField destinationField;
    private javax.swing.JPanel destinationPanel;
    private javax.swing.JScrollPane destinationScroll;
    private javax.swing.JTable destinationTable;
    private javax.swing.JLabel flight2;
    private javax.swing.JLabel flight3;
    private javax.swing.JLabel flight4;
    private javax.swing.JPanel flightContainer;
    private javax.swing.JTextField flightField;
    private javax.swing.JLabel flightHead2;
    private javax.swing.JLabel flightHead3;
    private javax.swing.JLabel flightHead4;
    private javax.swing.JPanel flightPanel;
    private javax.swing.JScrollPane flightScroll;
    private javax.swing.JTable flightTable;
    private javax.swing.JPanel headContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton moreButton;
    private javax.swing.JLabel otherDetails1;
    private javax.swing.JLabel otherDetails2;
    private javax.swing.JLabel otherDetails3;
    private javax.swing.JLabel otherDetails4;
    private javax.swing.JScrollPane passengerScroll;
    private javax.swing.JTable passengerTable;
    private javax.swing.JPanel recentFlightDetailPanel1;
    private javax.swing.JPanel recentFlightDetailPanel2;
    private javax.swing.JPanel recentFlightDetailPanel3;
    private javax.swing.JPanel recentFlightDetailPanel4;
    private javax.swing.JScrollPane recentFlightsScroll;
    private javax.swing.JPanel searchPanelContainer;
    private javax.swing.JLabel title;
    private javax.swing.JButton updatePassengerButton;
    // End of variables declaration//GEN-END:variables
}
