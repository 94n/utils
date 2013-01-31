package testpackage;

import testpackage.content.TimeUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * User: mtitov
 * Date: 12/6/11
 * Time: 12:22 PM
 */
public class DateUtilsLauncher {

    public static void main(String[] args) {
//        addDate();
//        System.out.println(TimeUtils.timeStampToDate(1335997506310l));
//        System.out.println(TimeUtils.getDateByDayOfYear(592, 2012));
//        halfTimeOfDay(9, 46);
//        TimeUtils.printTimeDiff(7, 30, 12, 8);
//        TimeUtils.printAddTime(9, 30, -4, -38);
        final Calendar start = GregorianCalendar.getInstance();
        start.set(Calendar.YEAR, 2012);
        start.set(Calendar.DAY_OF_MONTH, 22);
        start.set(Calendar.MONTH, Calendar.FEBRUARY);
        TimeUtils.printDayDifference(start.getTimeInMillis()); //529
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
