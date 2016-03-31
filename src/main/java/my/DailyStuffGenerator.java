package my;

import my.core.TimeUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * User: mtitov
 * Date: 4/4/12
 * Time: 1:37 PM
 */
public class DailyStuffGenerator {

    public static void main(String[] args) {
        printPiDigitIndex();
        printSportTimeCountingSecondPerDaySinceThirty();
    }

    private static void printSportTimeCountingSecondPerDaySinceThirty() {
        System.out.println("Sport time: " + TimeUtils.getSportTimeCountingSecondPerDaySinceThirty().toString());
    }

    private static void printPiDigitIndex() {
        System.out.println("pi digit index: " + TimeUtils.getDaySinceThirty());
    }

    //TODO refactor to java 8 dates before using
    private static void print2WeekVacationStartDates() {
        final Calendar workStart = GregorianCalendar.getInstance();
        workStart.set(Calendar.DAY_OF_MONTH, 12);
        workStart.set(Calendar.MONTH, Calendar.APRIL);
        workStart.set(Calendar.YEAR, 2014);
        Date vacationStartDate = workStart.getTime();
        int numberOfVacationsToCalculate = 4;
        double desiredVacationDays = 14;
        double vacationDaysPerYear = 24;
        int workDaysTillVacation = new Long(Math.round(desiredVacationDays / vacationDaysPerYear * 365.25)).intValue();
        for (int i = 0; i < numberOfVacationsToCalculate; i++) {
            vacationStartDate = null;//TimeUtils.addDate(vacationStartDate, workDaysTillVacation);
            System.out.println(vacationStartDate);
        }
    }

}
