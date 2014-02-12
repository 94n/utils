package testpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import testpackage.content.TimeUtils;

/**
 * User: mtitov Date: 12/6/11 Time: 12:22 PM
 */
public class DateUtilsLauncher {

	public static void main(String[] args) {
		// dateDifferenceInMinutes(2013, 7, 3, 13, 49, 2013, 7, 5, 13, 42);
		// dateDifferenceInDays(2013, 5, 23, 0, 0, 2013, 7, 22, 0, 0);
		// SimpleDateFormat simpleDateFormat = new
		// java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+1"));
		// System.out.println(simpleDateFormat.format(new
		// java.util.Date(1384251629612l)));
		TimeUtils.printTimeWithMillisecondsFromWeekStart(314159265);//3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679
		// System.out.println(TimeUtils.timeStampToDate(1335997506310l));
		// System.out.println(TimeUtils.getDateByDayOfYear(592, 2012));
		// halfTimeOfDay(9, 46);
		// TimeUtils.printTimeDiff(7, 30, 12, 8);
		// TimeUtils.printAddTime(9, 30, -4, -38);
		/*
		 * final Calendar start = GregorianCalendar.getInstance();
		 * start.set(Calendar.YEAR, 2012); start.set(Calendar.DAY_OF_MONTH, 22);
		 * start.set(Calendar.MONTH, Calendar.FEBRUARY);
		 * TimeUtils.printDayDifference(start.getTimeInMillis()); //529
		 */
	}

	static void dateDifferenceInDays(int startYear, int startMonth, int startDay, int startHour, int startMinute, int endYear, int endMonth, int endDay, int endHour, int endMinute) {
		final Calendar start = GregorianCalendar.getInstance();
		start.set(Calendar.YEAR, startYear);
		start.set(Calendar.MONTH, startMonth - 1);
		start.set(Calendar.DAY_OF_MONTH, startDay);
		start.set(Calendar.HOUR_OF_DAY, startHour);
		start.set(Calendar.MINUTE, startMinute);
		final Calendar end = GregorianCalendar.getInstance();
		end.set(Calendar.YEAR, endYear);
		end.set(Calendar.MONTH, endMonth - 1);
		end.set(Calendar.DAY_OF_MONTH, endDay);
		end.set(Calendar.HOUR_OF_DAY, endHour);
		end.set(Calendar.MINUTE, endMinute);
		TimeUtils.printDayDifference(start.getTimeInMillis(), end.getTimeInMillis());
	}

	static void dateDifferenceInMinutes(int startYear, int startMonth, int startDay, int startHour, int startMinute, int endYear, int endMonth, int endDay, int endHour, int endMinute) {
		final Calendar start = GregorianCalendar.getInstance();
		start.set(Calendar.YEAR, startYear);
		start.set(Calendar.MONTH, startMonth - 1);
		start.set(Calendar.DAY_OF_MONTH, startDay);
		start.set(Calendar.HOUR_OF_DAY, startHour);
		start.set(Calendar.MINUTE, startMinute);
		final Calendar end = GregorianCalendar.getInstance();
		end.set(Calendar.YEAR, endYear);
		end.set(Calendar.MONTH, endMonth - 1);
		end.set(Calendar.DAY_OF_MONTH, endDay);
		end.set(Calendar.HOUR_OF_DAY, endHour);
		end.set(Calendar.MINUTE, endMinute);
		TimeUtils.printMinuteDifference(start.getTimeInMillis(), end.getTimeInMillis());
	}

	static void halfTimeOfDay(Date date) {
		System.out.print("Half of day:");
		TimeUtils.printHalfTimeOfDay(date);
	}

	static void halfTimeOfDay(int hour, int minute) {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		halfTimeOfDay(calendar.getTime());
	}

	private static void addDate() {
		final Calendar calendar = GregorianCalendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 15);
		calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
		System.out.println(TimeUtils.addDate(calendar.getTime(), -45));
	}

}
