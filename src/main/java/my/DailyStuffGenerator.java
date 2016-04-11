package my;

import my.core.TimeUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * User: mtitov
 * Date: 4/4/12
 * Time: 1:37 PM
 */
public class DailyStuffGenerator {

    public static void main(String[] args) {
        //generateName(6);
        generatePassword(8, 2);
        //printPiTimePoints();
        //printPiDigitIndex();
        //printSportTimeCountingSecondPerDaySinceThirty();
    }

    private static void generatePassword(int length, int type) {
        System.out.println(my.core.repetition.StringGenerator.getPassword(length, type));
    }

    private static void generateName(int length) {
        System.out.println(my.core.repetition.StringGenerator.getName(length));
    }

    private static void printPiTimePoints() {
        String seed = "314159265358";
        List<LocalDateTime> timePoints = TimeUtils.getTimePoints(seed, LocalDate.of(2014, Month.APRIL, 12));
        for (LocalDateTime timePoint : timePoints) {
            System.out.println(timePoint.format(DateTimeFormatter.ofPattern("d MMMM yyyy H:m")));
        }
    }

    private static void printPiDigitIndex() {
        System.out.println("Pi digit index: " + TimeUtils.getDaySinceThirty());
    }

    private static void printSportTimeCountingSecondPerDaySinceThirty() {
        System.out.println("Sport time: " + TimeUtils.getSportTimeCountingSecondPerDaySinceThirty().toString());
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
