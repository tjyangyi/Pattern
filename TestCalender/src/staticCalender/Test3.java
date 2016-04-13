package staticCalender;


public class Test3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println(Year.thisYear.getYear());
		System.out.println(Year.nextYear.getYear());
		Year thisYearCopy1 = Year.thisYear.clone();
		thisYearCopy1.getMonths().get(1).getWeeks().get(1).setActualNum(999);
		System.out.println(thisYearCopy1.getMonths().get(1).getWeeks().get(1).getActualNum());
		Year thisYearCopy2 = Year.thisYear.clone();
		System.out.println(thisYearCopy2.getMonths().get(1).getWeeks().get(1).getActualNum());
		
	}
	
	

}
