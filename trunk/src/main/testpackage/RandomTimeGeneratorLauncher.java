package testpackage;

import testpackage.content.repetition.RandomTimeGenerator;

/**
 * User: mtitov Date: 10/31/11 Time: 1:48 PM
 */
public class RandomTimeGeneratorLauncher {

	public static void main(String[] args) {
		// final Calendar calendar = GregorianCalendar.getInstance();
		// calendar.set(Calendar.HOUR_OF_DAY, 12);
		// calendar.set(Calendar.MINUTE, 0);
		// System.out.println(calendar.getTime());
		// final long start = calendar.getTimeInMillis();
		// calendar.set(Calendar.HOUR_OF_DAY, 17);
		// System.out.println(calendar.getTime());
		// final long end = calendar.getTimeInMillis();
		// RandomTimeGenerator.printRandomTime(1, start, end);
		// RandomTimeGenerator.printSleepingTime();
//		RandomTimeGenerator.printFixedWorkingDayRandomTimeFromNow(1);
		RandomTimeGenerator.printRandomTime(1);
	}

}
