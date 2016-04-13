/***********************************************************************
 * $Id: DeliveryCalendarYear.java,v1.0 2016年4月11日 上午8:59:23 $
 * 
 * @author: YangYi
 * 
 * (c)Copyright 2011 Topvision All rights reserved.
 ***********************************************************************/
package staticCalender;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author YangYi
 * @created @2016年4月11日-上午8:59:23
 *
 */
public class Year implements Cloneable {

	public static Year thisYear = new Year(Calendar.getInstance().get(
			Calendar.YEAR));
	public static Year nextYear = new Year(Calendar.getInstance().get(
			Calendar.YEAR) + 1);

	static {
		calculateCalendar(thisYear);
		calculateCalendar(nextYear);
	}

	public static void calculateCalendar(Year year) {
		int yearNum = year.getYear();
		for (int monthNum = 1; monthNum <= 12; monthNum++) {
			Month month = new Month(yearNum, monthNum);
			year.addMonth(month);
			for (int weekNum = 1; weekNum <= month.getTotalWeekNum(); weekNum++) {
				Week week = new Week(yearNum, monthNum, weekNum);
				month.addWeek(week);
			}
		}
	}

	@Override
	protected Year clone() throws CloneNotSupportedException {
		Year copyYear = (Year) super.clone();
		copyYear.months = new ArrayList<Month>();
		for (int i = 0; i < this.months.size(); i++) {
			copyYear.addMonth(this.months.get(i).clone());
		}
		return copyYear;
	}

	private Integer year;
	private List<Month> months;

	public void addMonth(Month month) {
		this.months.add(month);
	}

	public Year(Integer year) {
		super();
		this.year = year;
		this.months = new ArrayList<Month>();
	}

	public Integer getYear() {
		return year;
	}

	public List<Month> getMonths() {
		return months;
	}

}
