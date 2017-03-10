package my;

import my.core.TimeUtils;
import my.core.repetition.RandomNumber;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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

    static void generateNumber(int min, int max) {
        p.accept(new RandomNumber().getFromRange(min, max));
    }

    static void printPiTimePoints() {
        String seed = "314159265358";
        List<LocalDateTime> timePoints = TimeUtils.getTimePoints(seed, LocalDate.of(2014, Month.APRIL, 12));
        for (LocalDateTime timePoint : timePoints) {
            p.accept(timePoint.format(DateTimeFormatter.ofPattern("d MMMM yyyy H:m")));
        }
    }

    //STARTING FROM 1
    static void printZeroBasedPiDigitIndex() {
        p.accept("Pi digit index: " + TimeUtils.getDaySinceThirty() + ". Select this number of digits, first not selected one is today index");
    }

    static void printSportTimeCountingSecondPerDaySinceThirty() {
        p.accept("Sport time: " + TimeUtils.getSportTimeCountingSecondPerDaySinceThirty().toString());
    }

    //TODO refactor to java 8 dates before using
    static void print2WeekVacationStartDates() {
        LocalDate vacationStartDate = LocalDate.of(2016, Month.AUGUST, 11);
        int numberOfVacationsToCalculate = 8;
        double desiredVacationDays = 14;
        double vacationDaysPerYear = 28;
        int workDaysTillVacation = new Long(Math.round(desiredVacationDays / vacationDaysPerYear * 365.25)).intValue();
        for (int i = 0; i < numberOfVacationsToCalculate; i++) {
            vacationStartDate = vacationStartDate.plusDays(workDaysTillVacation);
            p.accept(vacationStartDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        }
    }

}
