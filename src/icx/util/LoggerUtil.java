package icx.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LoggerUtil {

    private static final Logger logger = Logger.getLogger("icx.util");

    private static FileHandler fileHandler;

    static {
        try {
            fileHandler = new FileHandler("icx.util.FlightManagement.txt", true);
        } catch (Exception e) {
            logger.warning("Failed to initialize logger: " + e.getMessage());
        }
        logger.addHandler(fileHandler);
    }

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logWarning(String message) {
        logger.warning(message);
    }

    public static void logSevere(String message) {
        logger.severe(message);
    }
}
