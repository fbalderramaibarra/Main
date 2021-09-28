package date;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double hour = 17.0;
		int minute = 37;
		int second = 52;
		double secondsSinceMidnight = hour * 3600.0;
		double secondsRemainingDay = (24.0 - hour) * 3600.0;
		double percentageofDaypassed = hour / 24.0;
		System.out.println(secondsSinceMidnight);
		System.out.println(secondsRemainingDay);
		System.out.println(percentageofDaypassed);
	}

}
