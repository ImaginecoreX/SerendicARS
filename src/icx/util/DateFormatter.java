package icx.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ksoff
 */
public class DateFormatter {

    public String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

}
