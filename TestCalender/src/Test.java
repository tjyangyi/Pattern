import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	static String[] weeks = { "日", "一", "二", "三", "四", "五", "六" };

	public static void main(String[] args) throws ParseException {
		// Calendar c = Calendar.getInstance();
		// c.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2016-04-03"));
		// System.out.println(c.getTime());
		// int month = c.get(Calendar.MONTH);// 获取是本年的第几月
		// int week = c.get(Calendar.WEEK_OF_MONTH);// 获取是本月的第几周
		// int day = c.get(Calendar.DAY_OF_WEEK);// 获致是本周的第几天地, 1代表星期天...7代表星期六
		// System.out.println("今天是本年的第" + (month + 1) + "月");
		// System.out.println("今天是本月的第" + week + "周");
		// System.out.println("今天是星期" + weeks[day - 1]);
		// System.out.println("今天是本月的第" + c.get(Calendar.DAY_OF_MONTH) + "天");
		Date aWeekAgo = new Date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.parse("2016-02-08 01:00:00").getTime() - 7 * 24 * 3600 * 1000);
		System.out.println(aWeekAgo);
		Date dateBegin;
		Date dateEnd;
		try {
			dateBegin = ReportUtils.getDateBegin(aWeekAgo);
			dateEnd = new Date(dateBegin.getTime() + 7 * 24 * 3600 * 1000 - 1);
			// dateEnd = ReportUtils.getDateEnd(aWeekAgo);
		} catch (ParseException e) {
			e.printStackTrace();
			return;
		}
		System.out.println(dateBegin);
		System.out.println(dateEnd);

		Calendar dateBeginCalendar = Calendar.getInstance();
		dateBeginCalendar.setTime(dateBegin);
		int month = dateBeginCalendar.get(Calendar.MONTH) + 1;// 第几个月
		int week = dateBeginCalendar.get(Calendar.WEEK_OF_MONTH);// 本月的第几周
		int day = dateBeginCalendar.get(Calendar.DAY_OF_MONTH);// 本月的第几天
	//	int day = dateBeginCalendar.get(Calendar.day);// 本月的第几天
		System.out.println("周:" + week);
		if (day != 1) {
			week--;
		}
		System.out.println("月:" + month);
		System.out.println("周:" + week);
		System.out.println("天:" + day);
	}
}
