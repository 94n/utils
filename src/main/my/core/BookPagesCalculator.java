package my.core;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * User: mtitov
 * Date: 4/24/12
 * Time: 8:09 PM
 */
public class BookPagesCalculator {

    public static final int LAST_READ_PAGE = 85;

    public static void main(String[] args) {
        final int pagesPerDay = getPagesPerDayTillJune29();
        System.out.println("Pages to read: " + (LAST_READ_PAGE + 1) + " - " + (LAST_READ_PAGE + pagesPerDay) + " (" + pagesPerDay + " pages)");
    }

    public static int getPagesPerDayTillJune29() {
        final Calendar todayCalendar = GregorianCalendar.getInstance();
        final Calendar targetCalendar = GregorianCalendar.getInstance();
        targetCalendar.set(Calendar.MONTH, Calendar.JUNE);
        targetCalendar.set(Calendar.DATE, 29);
        if (todayCalendar.get(Calendar.DAY_OF_YEAR) > targetCalendar.get(Calendar.DAY_OF_YEAR)) {
            targetCalendar.add(Calendar.YEAR, 1);
        }
        final long millisecondsDifference = targetCalendar.getTimeInMillis() - todayCalendar.getTimeInMillis();
        final double daysLeft = millisecondsDifference / MILLISECONDS_IN_DAY;
        return (int) Math.ceil((TOTAL_PAGES_NUMBER - LAST_READ_PAGE) / daysLeft);
    }

    private static final int TOTAL_PAGES_NUMBER = 240;

    private static final long MILLISECONDS_IN_DAY = 1000 * 60 * 60 * 24;

}
