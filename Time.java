package date;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hour = 17.0;
		int minute = 37;
		int second = 52;
		double secondsSinceMidnight = hour * 3600.0;
		double secondsRemainingDay = (24.0 - hour) * 3600.0;
		double percentageofDaypassed = hour / 24.0 * 100.0;
		System.out.print("Seconds since midnight: ");
		System.out.println(secondsSinceMidnight);
		System.out.print("Seconds remaining in the day: ");
		System.out.println(secondsRemainingDay);
		System.out.print("Percentage of day passed: ");
		System.out.println(percentageofDaypassed);
	}

}
