
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportUtils {
    public static Date getDateTime(Date date, String time) throws ParseException {
        String tempStr = new SimpleDateFormat("yyyy-MM-dd").format(date) + time;
        return new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").parse(tempStr);
    }

    public static Date getDateBegin(Date date) throws ParseException {
        return getDateTime(date, "00:00:00");
    }

    public static Date getDateEnd(Date date) throws ParseException {
        return getDateTime(date, "23:59:59");
    }
    
    public static String date2String(Date date) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").format(date) ;
    }
}
