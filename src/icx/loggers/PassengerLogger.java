package icx.loggers;

import java.io.IOException;
import java.util.logging.Logger;
// import java.util.logging.LogManager;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author ksoff
 */
public class PassengerLogger {

    public static final Logger logger = Logger.getLogger(PassengerLogger.class.getName());

    static {

//        try {
//            LogManager.getLogManager().readConfiguration(
//                    passengerLogger.class.getResourceAsStream("icx/application/main/sub/passenger/passengerLogger.properties")
//            );
//        } catch (IOException | SecurityException ex) {
//            System.out.println(ex.getMessage());
//        }

        try {
            FileHandler fileHandler = new FileHandler("passenger.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
