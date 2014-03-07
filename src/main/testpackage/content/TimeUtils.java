package testpackage.content;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * User: mtitov Date: 12/6/11 Time: 12:17 PM
 */
public class TimeUtils {

	private static final int	WORKING_DAY_START_HOUR		= 9;
	private static final int	WORKING_DAY_START_MINUTE	= 0;

	private static final int	WORKING_DAY_END_HOUR		= 18;
	private static final int	WORKING_DAY_END_MINUTE		= WORKING_DAY_START_MINUTE;

	private static final int	LIGHT_DAY_START_HOUR		= 7;
	private static final int	LIGHT_DAY_START_MINUTE		= 30;

	private static final int	LIGHT_DAY_END_HOUR			= 23;
	private static final int	LIGHT_DAY_END_MINUTE		= 30;

	private static final long	DAYS_IN_WEEK				= 7;
	private static final long	HOURS_IN_DAY				= 24;
	private static final long	SECONDS_IN_MINUTE			= 60;
	public static final int		MINUTES_IN_HOUR				= 60;
	public static final long	SECOND						= 1000;
	public static final long	MINUTE						= SECOND * SECONDS_IN_MINUTE;
	public static final long	HOUR						= SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR;
	public static final long	DAY							= SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY;
	public static final long	WEEK						= SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_WEEK;

	public static Date addDate(Date from, int days) {
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTimeInMillis(from.getTime());
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return calendar.getTime();
	}

	public static Date addDate(int days) {
		return addDate(new Date(), days);
	}

	public static Date getDateByDayOfYear(int dayOfYear, int year) {
		Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
		return calendar.getTime();
	}

	public static Date timeStampToDate(long millis) {
		return new Date(millis);
	}

	public static long getDayEndTime() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		return calendar.getTimeInMillis();
	}

	public static long getDayStartTime() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		return calendar.getTimeInMillis();
	}

	public static long getNineHoursDayEnd(Date start) {
		final Calendar calendar = GregorianCalendar.getInstance();
		if (start != null) {
			calendar.setTime(start);
		}
		calendar.add(Calendar.HOUR_OF_DAY, 9);
		return calendar.getTimeInMillis();
	}

	public static long getLightDayStartTime() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, LIGHT_DAY_START_HOUR);
		calendar.set(Calendar.MINUTE, LIGHT_DAY_START_MINUTE);
		return calendar.getTimeInMillis();
	}

	public static long getLightDayEndTime() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, LIGHT_DAY_END_HOUR);
		calendar.set(Calendar.MINUTE, LIGHT_DAY_END_MINUTE);
		return calendar.getTimeInMillis();
	}

	public static long getWorkingDayStartTime() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, WORKING_DAY_START_HOUR);
		calendar.set(Calendar.MINUTE, WORKING_DAY_START_MINUTE);
		return calendar.getTimeInMillis();
	}

	public static long getWorkingDayEndTime() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, WORKING_DAY_END_HOUR);
		calendar.set(Calendar.MINUTE, WORKING_DAY_END_MINUTE);
		return calendar.getTimeInMillis();
	}

	public static String getTimeByMillis(long millis) {
		return new Time(millis).toString().substring(0, 5);
	}

	public static void printAddMinutes(int minutes) {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.add(Calendar.MINUTE, minutes);
		printTimeByMillis(calendar.getTimeInMillis());
	}

	public static void printAddTime(int startHour, int startMinute, int addHour, int addMinute) {
		printTimeByDate(addTime(startHour, startMinute, addHour, addMinute));
	}

	public static void printDayDifference(long startDate) {
		final long now = new Date().getTime();
		System.out.println((now - startDate) / DAY);
	}

	public static void printDayDifference(long startDate, long endDate) {
		System.out.println((endDate - startDate) / DAY);
	}

	public static void printMinuteDifference(long startDate, long endDate) {
		final long fullDiff = endDate - startDate;
		System.out.println(fullDiff / MINUTE);
	}

	public static void printHalfTimeOfDay(Date start) {
		final long dayEnd = getWorkingDayEndTime() - HOUR;// dinner
		final long difference = dayEnd - start.getTime();
		final long halfTime = difference / 2;
		final long dayStart = getDayStartTime();
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTimeInMillis(dayStart + halfTime);
		printTimeByMillis(calendar.getTimeInMillis());
	}

	public static void printTimeByMillis(long millis) {
		System.out.println(getTimeByMillis(millis));
	}

	public static void printTimeDiff(int startHour, int startMinute, int endHour, int endMinute) {
		final Date start = getDateByTime(startHour, startMinute);
		final Date end = getDateByTime(endHour, endMinute);
		printTimeByMillis(end.getTime() - start.getTime() - SECOND * SECONDS_IN_MINUTE * MINUTES_IN_HOUR * 2);
	}

	/**
	 * Returns time counting given number of milliseconds from week start
	 * 
	 * @param milliseconds
	 *            must be less or equal to week size
	 */
	public static void printTimeWithMillisecondsFromWeekStart(long milliseconds) {
		long days = milliseconds / DAY;
		long hours = (milliseconds - days * DAY) / HOUR;
		long minutes = (milliseconds - days * DAY - hours * HOUR) / MINUTE;
		System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes");
	}

	private static Date addTime(int startHour, int startMinute, int addHour, int addMinute) {
		final Date start = getDateByTime(startHour, startMinute);
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.setTime(start);
		calendar.add(Calendar.HOUR, addHour);
		calendar.add(Calendar.MINUTE, addMinute);
		return calendar.getTime();
	}

	private static Date getDateByTime(int hour, int minute) {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		return calendar.getTime();
	}

	private static void printTimeByDate(Date date) {
		printTimeByMillis(date.getTime());
	}

}
