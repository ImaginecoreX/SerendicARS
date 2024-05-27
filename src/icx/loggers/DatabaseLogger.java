package icx.loggers;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author ksoff
 */
public class DatabaseLogger {
    public static final Logger logger = Logger.getLogger(DatabaseLogger.class.getName());

    static {

        try {
            FileHandler fileHandler = new FileHandler("db.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
