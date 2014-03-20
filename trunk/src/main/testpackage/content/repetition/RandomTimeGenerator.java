package testpackage.content.repetition;

import testpackage.content.TimeUtils;

import java.sql.Time;
import java.util.*;

/**
 * User: mtitov Date: 10/31/11 Time: 1:40 PM
 */
public class RandomTimeGenerator {

	public static long getLightDayRandomTime() {
		final long start = TimeUtils.getLightDayStartTime();
		final long end = TimeUtils.getLightDayEndTime();
		return getRandomTime(1, start, end).get(0);
	}

	public static List<Long> getFixedWorkingDayRandomTime(int number) {
		final long start = TimeUtils.getWorkingDayStartTime();
		final long end = TimeUtils.getWorkingDayEndTime();
		return getRandomTime(number, start, end);
	}

	public static List<Long> getFixedWorkingDayRandomTimeFromNow(int number) {
		final long start = new Date().getTime();
		final long end = TimeUtils.getWorkingDayEndTime();
		return getRandomTime(number, start, end);
	}

	public static List<Long> getRandomTime(int number) {
		final long start = TimeUtils.getDayStartTime();
		final long end = TimeUtils.getDayEndTime();
		return getRandomTime(number, start, end);
	}

	public static List<Long> getRandomTime(int number, long start, long end) {
		// Time is used instead of Date because of toString
		final List<Long> times = new ArrayList<Long>();
		for (int i = 0; i < number; i++) {
			final long time = new RandomNumber().getFromRange(start, end);
			times.add(time);
		}
		return times;
	}

	public static List<Long> getWorkingDayRandomTime(int number) {
		final long start = new Date().getTime();
		final long end = TimeUtils.getNineHoursDayEnd(null);
		return getRandomTime(number, start, end);
	}

	public static long getRandomTime() {
		final long start = TimeUtils.getDayStartTime();
		final long end = TimeUtils.getDayEndTime();
		return getRandomTime(1, start, end).get(0);
	}

	public static void printFixedWorkingDayRandomTime(int number) {
		for (Long time : getFixedWorkingDayRandomTime(number)) {
			TimeUtils.printTimeByMillis(time);
		}
	}

	public static void printFixedWorkingDayRandomTimeFromNow(int number) {
		for (Long time : getFixedWorkingDayRandomTimeFromNow(number)) {
			TimeUtils.printTimeByMillis(time);
		}
	}

	public static void printFixedWorkingDayRandomTimeRange(int number) {
		final List<Long> times = getFixedWorkingDayRandomTime(number);
		for (Long time : times) {
			final long leftTillEndOfDay = TimeUtils.getWorkingDayEndTime() - time;
			final long length = new RandomNumber().getFromRange(0l, leftTillEndOfDay);
			final Long rangeEndTime = time + length;
			System.out.println(TimeUtils.getTimeByMillis(time) + " - " + TimeUtils.getTimeByMillis(rangeEndTime));
		}
	}

	public static void printHour() {
		int left = TimeUtils.MINUTES_IN_HOUR;
		final Map<Long, Integer> schedule = new TreeMap<Long, Integer>();
		do {
			int span = new RandomNumber().getFromRange(1, TimeUtils.MINUTES_IN_HOUR);
			if (span > left) {
				span = left;
			}
			schedule.put(getLightDayRandomTime(), span);
			left -= span;
		} while (left > 0);
		for (Long time : schedule.keySet()) {
			System.out.println(TimeUtils.getTimeByMillis(time) + " - " + schedule.get(time) + " min");
		}
	}

	public static void printRandomTime(int number) {
		for (Long time : getRandomTime(number)) {
			TimeUtils.printTimeByMillis(time);
		}
	}

	public static void printRandomTime(int number, long start, long end) {
		for (Long time : getRandomTime(number, start, end)) {
			TimeUtils.printTimeByMillis(time);
		}
	}

	public static void printSleepingTime() {
		final int minutesToSleep = new RandomNumber().getFromRange(240, 600);// 4
																				// -
																				// 10
																				// hours
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.add(Calendar.MINUTE, -minutesToSleep);
		System.out.println(minutesToSleep + " minutesToSleep: ");
		TimeUtils.printTimeByMillis(calendar.getTimeInMillis());
	}

	public static void printWorkingDayRandomTime(int number) {
		for (Long time : getWorkingDayRandomTime(number)) {
			TimeUtils.printTimeByMillis(time);
		}
	}

	public static void printWorkingDayRandomTimeRange(int number) {
		final List<Long> times = getWorkingDayRandomTime(number);
		for (Long time : times) {
			final long leftTillEndOfDay = TimeUtils.getNineHoursDayEnd(null) - time;
			final long length = new RandomNumber().getFromRange(0l, leftTillEndOfDay);
			final Long rangeEndTime = time + length;
			System.out.println(TimeUtils.getTimeByMillis(time) + " - " + TimeUtils.getTimeByMillis(rangeEndTime));
		}
	}

}
