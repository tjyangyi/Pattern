/**
 * 
 */
package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author YangYi
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		Date date = new Date(System.currentTimeMillis() - 24 * 3600 * 1000);
		System.out.println(date);
		System.out.println(getDayBegin(date));
		System.out.println(getDayEnd(date));
	}

	public static Date getDateTime(Date date, String time)
			throws ParseException {
		String tempStr = new SimpleDateFormat("yyyy-MM-dd").format(date) + time;
		return new SimpleDateFormat("yyyy-MM-ddHH:mm:ss").parse(tempStr);
	}

	public static Date getDayBegin(Date date) throws ParseException {
		return getDateTime(date, "00:00:00");
	}

	public static Date getDayEnd(Date date) throws ParseException {
		return getDateTime(date, "23:59:59");
	}

}
