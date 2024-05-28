package icx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sandaruwan
 */
public class ReportFactory {

    public ReportFactory() {
    }

    public void getAircraftManufactureReport() {
        Report report = new Report();
        // Sample timestamp
        String timestampStr = "2023-05-28 14:30:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date timestamp = dateFormat.parse(timestampStr);
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(new SimpleDateFormat("yyyy-MM-dd").format(timestamp));
            Date time = new SimpleDateFormat("HH:mm:ss").parse(new SimpleDateFormat("HH:mm:ss").format(timestamp));

            // Generate the Aircraft Manufacture Report
            report.printAircraftManufactureReport(date, time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
