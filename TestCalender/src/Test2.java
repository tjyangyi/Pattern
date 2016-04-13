import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test2 {
	public static int year = 2016;
	private static int month = 3;
	private static int week = 1;

	// private static void day() {
	// Calendar calendar = Calendar.getInstance();
	// calendar.set(year, month - 1, 3);
	// System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(calendar
	// .getTime()));
	// System.out.println("月:" + (calendar.get(Calendar.MONTH) + 1));
	// System.out.println("周:" + calendar.get(Calendar.WEEK_OF_MONTH));
	// System.out.println("周中的第几天:" + calendar.get(Calendar.DAY_OF_WEEK));
	//
	// }

	public static void main(String[] args) {
		System.out.println(calTotalWeekNum());
		cal();
		// day();
	}

	private static Integer calTotalWeekNum() {
		int day = 1;
		int totalWeekNum = 0;
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, day);
		System.out
				.println("当月的第一天是:"
						+ new SimpleDateFormat("yyyy-MM-dd").format(calendar
								.getTime()));
		while (calendar.get(Calendar.MONTH) == month - 1) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				totalWeekNum++;
			}
			calendar.add(Calendar.DATE, 1);
		}
		return totalWeekNum;
	}

	private static void cal() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
			calendar.add(Calendar.DATE, 1);
		}
		int nowWeek = 1;
		while (nowWeek != week) {
			calendar.add(Calendar.DATE, 7);
			nowWeek++;
		}
		System.out
				.println("该周的第一天是:"
						+ new SimpleDateFormat("yyyy-MM-dd").format(calendar
								.getTime()));
	}

}
