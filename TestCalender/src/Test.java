import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	static String[] weeks = { "��", "һ", "��", "��", "��", "��", "��" };

	public static void main(String[] args) throws ParseException {
		// Calendar c = Calendar.getInstance();
		// c.setTime(new SimpleDateFormat("yyyy-MM-dd").parse("2016-04-03"));
		// System.out.println(c.getTime());
		// int month = c.get(Calendar.MONTH);// ��ȡ�Ǳ���ĵڼ���
		// int week = c.get(Calendar.WEEK_OF_MONTH);// ��ȡ�Ǳ��µĵڼ���
		// int day = c.get(Calendar.DAY_OF_WEEK);// �����Ǳ��ܵĵڼ����, 1����������...7����������
		// System.out.println("�����Ǳ���ĵ�" + (month + 1) + "��");
		// System.out.println("�����Ǳ��µĵ�" + week + "��");
		// System.out.println("����������" + weeks[day - 1]);
		// System.out.println("�����Ǳ��µĵ�" + c.get(Calendar.DAY_OF_MONTH) + "��");
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
		int month = dateBeginCalendar.get(Calendar.MONTH) + 1;// �ڼ�����
		int week = dateBeginCalendar.get(Calendar.WEEK_OF_MONTH);// ���µĵڼ���
		int day = dateBeginCalendar.get(Calendar.DAY_OF_MONTH);// ���µĵڼ���
	//	int day = dateBeginCalendar.get(Calendar.day);// ���µĵڼ���
		System.out.println("��:" + week);
		if (day != 1) {
			week--;
		}
		System.out.println("��:" + month);
		System.out.println("��:" + week);
		System.out.println("��:" + day);
	}
}
