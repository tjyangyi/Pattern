package staticCalender;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Month implements Cloneable {
	private Integer year;
	private Integer month;
	private Integer totalWeekNum = 0;
	private List<Week> weeks;

	@Override
	protected Month clone() throws CloneNotSupportedException {
		Month copyMonth = (Month) super.clone();
		copyMonth.weeks = new ArrayList<Week>();
		for (int i = 0; i < this.weeks.size(); i++) {
			copyMonth.addWeek(this.weeks.get(i).clone());
		}
		return copyMonth;
	}

	public void addWeek(Week week) {
		this.weeks.add(week);
	}

	public Month(Integer year, Integer month) {
		super();
		this.year = year;
		this.month = month;
		this.weeks = new ArrayList<Week>();
		this.calculateTotalWeekNum();
	}

	private void calculateTotalWeekNum() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.year, this.month - 1, 1);// 鏈堜唤闇�鍑�
		while (calendar.get(Calendar.MONTH) == month - 1) {
			if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				this.totalWeekNum++;
			}
			calendar.add(Calendar.DATE, 1);
		}
	}

	public Integer getTotalWeekNum() {
		return totalWeekNum;
	}

	public Integer getMonth() {
		return month;
	}

	public List<Week> getWeeks() {
		return weeks;
	}

}
