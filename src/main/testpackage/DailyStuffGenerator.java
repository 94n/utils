package testpackage;

import testpackage.content.TimeUtils;
import testpackage.content.MenuGenerator;
import testpackage.content.repetition.RandomNumber;
import testpackage.content.repetition.RandomTimeGenerator;
import testpackage.content.repetition.stringlists.StringListGenerator;
import testpackage.content.repetition.stringlists.StringType;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * User: mtitov
 * Date: 4/4/12
 * Time: 1:37 PM
 */
public class DailyStuffGenerator {

    private static final int TENNISS_MAX_COUNT = 2;//2.1

    public static void main(String[] args) {
        generateRandomTennisTime();
        System.out.println();
        DateUtilsLauncher.halfTimeOfDay(new Date());//02.33
    }

    private static void generateMenu() {
        System.out.println();
        System.out.println("Menu:");
        for (String dish : MenuGenerator.getMenu()) {
            System.out.println(dish);
        }
    }

    private static void generateMusicTime() {
        System.out.println();
        System.out.println("Music: ");
        RandomTimeGenerator.printWorkingDayRandomTimeRange(1);
    }

    private static void generateRandomTennisTime() {
        System.out.println();
        System.out.println("Tennis: ");
        long start = new Date().getTime();
        final long dayEnd = TimeUtils.getWorkingDayEndTime() - 15 * TimeUtils.MINUTE;//Теннис за 15 минут до конца рабочего дня
        final int count = new RandomNumber().getFromRange(1, TENNISS_MAX_COUNT);
        for (int i = 0; i < count; i++) {
            RandomTimeGenerator.printRandomTime(1, start, dayEnd);
            StringListGenerator.shufflePrintStrings(StringType.TENNIS_PARTNERS, 1);
        }
    }

    private static void generateTennisTime() {
        System.out.println();
        System.out.println("Tennis: ");

        final long dayEnd = TimeUtils.getWorkingDayEndTime() - 15 * TimeUtils.MINUTE;//Теннис за 15 минут до конца рабочего дня

        final Calendar calendar = GregorianCalendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY, 2);
        long start = calendar.getTimeInMillis();

        calendar.add(Calendar.HOUR_OF_DAY, 1);
        long end = calendar.getTimeInMillis();

        if (end < dayEnd) {
            RandomTimeGenerator.printRandomTime(1, start, end);
        } else {
            RandomTimeGenerator.printRandomTime(1, start, dayEnd);
        }
        StringListGenerator.shufflePrintStrings(StringType.TENNIS_PARTNERS, 1);

        final int period = 3;
        while (end < dayEnd) {
            start = end;
            calendar.add(Calendar.HOUR_OF_DAY, period);
            end = calendar.getTimeInMillis();

            if (start < dayEnd) {
                if (end < dayEnd) {
                    RandomTimeGenerator.printRandomTime(1, start, end);
                } else {
                    RandomTimeGenerator.printRandomTime(1, start, dayEnd);
                }
                StringListGenerator.shufflePrintStrings(StringType.TENNIS_PARTNERS, 1);
            }
        }
    }

}
