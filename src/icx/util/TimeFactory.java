package icx.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author sandaruwan
 */
public class TimeFactory {

    public Timestamp getDateTime() {
        LocalDateTime now = LocalDateTime.now();

        // Convert LocalDateTime to java.sql.Timestamp
        Timestamp timestamp = Timestamp.valueOf(now);
        return timestamp;
    }

}
