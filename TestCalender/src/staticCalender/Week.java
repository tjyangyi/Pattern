/***********************************************************************
 * $Id: Week.java,v1.0 2016年4月11日 上午8:59:55 $
 * 
 * @author: YangYi
 * 
 * (c)Copyright 2011 Topvision All rights reserved.
 ***********************************************************************/
package staticCalender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author YangYi
 * @created @2016年4月11日-上午8:59:55
 *
 */
public class Week implements Cloneable {
	private Integer year;
	private Integer month;
	private Integer week;
	private String days;
	private Integer planNum;
	private Integer actualNum;

	@Override
	protected Week clone() throws CloneNotSupportedException {
		return (Week) super.clone();
	}

	public Week(Integer year, Integer month, Integer week) {
		super();
		this.year = year;
		this.month = month;
		this.week = week;
		this.calculateDays();
	}

	public void calculateDays() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.year, this.month - 1, 1);
		while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) { // 扫描到第一个星期一，则为第一周
			calendar.add(Calendar.DATE, 1);
		}
		int weekIndex = 1;
		while (weekIndex != this.week) { // 扫描到第N周，获取该周1日期
			calendar.add(Calendar.DATE, 7);
			weekIndex++;
		}
		Date dayBegin = calendar.getTime();
		calendar.add(Calendar.DAY_OF_WEEK, 6);
		Date dayEnd = calendar.getTime();
		String dayBeginStr = new SimpleDateFormat("MM.dd").format(dayBegin);
		String dayEndStr = new SimpleDateFormat("MM.dd").format(dayEnd);
		StringBuffer sb = new StringBuffer();
		sb.append(dayBeginStr);
		sb.append(" - ");
		sb.append(dayEndStr);
		this.days = sb.toString();
	}

	public Integer getWeek() {
		return week;
	}

	public String getDays() {
		return days;
	}

	public Integer getPlanNum() {
		return planNum;
	}

	public void setPlanNum(Integer planNum) {
		this.planNum = planNum;
	}

	public Integer getActualNum() {
		return actualNum;
	}

	public void setActualNum(Integer actualNum) {
		this.actualNum = actualNum;
	}

}
