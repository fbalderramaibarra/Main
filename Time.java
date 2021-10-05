package date;

public class Time {

	public static void main(String[] args) {
		double hour = 17.0;
		int minute = 37;
		int second = 52;
		final int HOURS_DAY = 24;
		final int SECONDS_HOUR = 3600;
		int secondsSinceMidnight = hour * SECONDS_HOUR;
		int secondsRemainingDay = (HOURS_DAY - hour) * SECONDS_HOUR;
		int percentageofDaypassed = hour * 100 / HOURS_DAY;
		System.out.print("Seconds since midnight: ");
		System.out.println(secondsSinceMidnight);
		System.out.print("Seconds remaining in the day: ");
		System.out.println(secondsRemainingDay);
		System.out.print("Percentage of day passed: ");
		System.out.println(percentageofDaypassed);
	}

}
