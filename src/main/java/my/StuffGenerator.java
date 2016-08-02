package my;

import my.core.TimeUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * User: mtitov
 * Date: 4/4/12
 * Time: 1:37 PM
 */
public interface StuffGenerator {

    static void addDays(LocalDate start, int days) {
        System.out.println(start.plusDays(days));
    }

    //8 Interface improvements
    //for (12.4.2014, 13.4.2014) it prints 2
    default void printInclusiveDateDifferenceInDays(LocalDate start, LocalDate end) {
        System.out.println(ChronoUnit.DAYS.between(start, end) + 1);
    }

    static void printDateSince(LocalDate start, int daysToAdd) {
        System.out.println(start.plusDays(daysToAdd));
    }

    //8 Interface improvements
    static void generatePassword(int length, int type) {
        System.out.println(my.core.repetition.StringGenerator.generateString(length, type));
    }

    static void generateName(int length, int type) {
        System.out.println(my.core.repetition.StringGenerator.generateString(length, type));
    }

    static void printPiTimePoints() {
        String seed = "314159265358";
        List<LocalDateTime> timePoints = TimeUtils.getTimePoints(seed, LocalDate.of(2014, Month.APRIL, 12));
        for (LocalDateTime timePoint : timePoints) {
            System.out.println(timePoint.format(DateTimeFormatter.ofPattern("d MMMM yyyy H:m")));
        }
    }

    //STARTING FROM 1
    static void printOneBasedPiDigitIndex() {
        System.out.println("Pi digit index: " + TimeUtils.getDaySinceThirty());
    }

    static void printSportTimeCountingSecondPerDaySinceThirty() {
        System.out.println("Sport time: " + TimeUtils.getSportTimeCountingSecondPerDaySinceThirty().toString());
    }

    //TODO refactor to java 8 dates before using
    static void print2WeekVacationStartDates() {
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
