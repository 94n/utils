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
import java.util.function.Consumer;

/**
 * User: mtitov
 * Date: 4/4/12
 * Time: 1:37 PM
 */
public interface StuffGenerator {

    Consumer<Object> p = System.out::println;

    static void addDays(LocalDate start, int days) {
        p.accept(start.plusDays(days));
    }

    //8 Interface improvements
    //Additionally, more importantly, interfaces can now define default methods.
    //for (12.4.2014, 13.4.2014) it prints 2
    default void printInclusiveDateDifferenceInDays(LocalDate start, LocalDate end) {
        p.accept(ChronoUnit.DAYS.between(start, end) + 1);
    }

    static void printDateSince(LocalDate start, int daysToAdd) {
        p.accept(start.plusDays(daysToAdd));
    }

    //8 Interface improvements
    //Interfaces can now define static methods.
    static void generatePassword(int length, int type) {
        p.accept(my.core.repetition.StringGenerator.generateString(length, type));
    }

    static void generatePassword(int length, int type, boolean includeAllSymbolTypes) {
        p.accept(my.core.repetition.StringGenerator.generateString(length, type, includeAllSymbolTypes));
    }

    static void generateName(int length, int type) {
        p.accept(my.core.repetition.StringGenerator.generateString(length, type));
    }

    static void printPiTimePoints() {
        String seed = "314159265358";
        List<LocalDateTime> timePoints = TimeUtils.getTimePoints(seed, LocalDate.of(2014, Month.APRIL, 12));
        for (LocalDateTime timePoint : timePoints) {
            p.accept(timePoint.format(DateTimeFormatter.ofPattern("d MMMM yyyy H:m")));
        }
    }

    //STARTING FROM 1
    static void printOneBasedPiDigitIndex() {
        p.accept("Pi digit index: " + TimeUtils.getDaySinceThirty());
    }

    static void printSportTimeCountingSecondPerDaySinceThirty() {
        p.accept("Sport time: " + TimeUtils.getSportTimeCountingSecondPerDaySinceThirty().toString());
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
            p.accept(vacationStartDate);
        }
    }

}
