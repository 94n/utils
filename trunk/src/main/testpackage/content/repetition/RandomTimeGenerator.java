package testpackage.content.repetition;

import testpackage.content.TimeUtils;

import java.sql.Time;
import java.util.*;

/**
 * User: mtitov
 * Date: 10/31/11
 * Time: 1:40 PM
 */
public class RandomTimeGenerator {

    public static void printRandomTime(int number) {
        for (Long time : getRandomTime(number)) {
            TimeUtils.printTimeByMillis(time);
        }
    }

    public static List<Long> getRandomTime(int number) {
        final long start = TimeUtils.getDayStartTime();
        final long end = TimeUtils.getDayEndTime();
        return getRandomTime(number, start, end);
    }

    public static void printWorkingDayRandomTime(int number) {
        for (Long time : getWorkingDayRandomTime(number)) {
            TimeUtils.printTimeByMillis(time);
        }
    }

    public static void printRandomTime(int number, long start, long end) {
        for (Long time : getRandomTime(number, start, end)) {
            TimeUtils.printTimeByMillis(time);
        }
    }

    public static void printWorkingDayRandomTimeRange(int number) {
        final List<Long> times = getWorkingDayRandomTime(number);
        for (Long time : times) {
            final long leftTillEndOfDay = TimeUtils.getNineHoursDayEnd(null) - time;
            final long length = new RandomNumber().getFromRange(0l, leftTillEndOfDay);
            final Long rangeEndTime = time + length;
            System.out.println(TimeUtils.getTimeByMillis(time) + " - " + TimeUtils.getTimeByMillis(rangeEndTime));
        }
    }

    public static void printFixedWorkingDayRandomTimeRange(int number) {
        final List<Long> times = getFixedWorkingDayRandomTime(number);
        for (Long time : times) {
            final long leftTillEndOfDay = TimeUtils.getWorkingDayEndTime() - time;
            final long length = new RandomNumber().getFromRange(0l, leftTillEndOfDay);
            final Long rangeEndTime = time + length;
            System.out.println(TimeUtils.getTimeByMillis(time) + " - " + TimeUtils.getTimeByMillis(rangeEndTime));
        }
    }

    public static void printFixedWorkingDayRandomTime(int number) {
        for (Long time : getFixedWorkingDayRandomTime(number)) {
            TimeUtils.printTimeByMillis(time);
        }
    }

    public static List<Long> getWorkingDayRandomTime(int number) {
        final long start = new Date().getTime();
        final long end = TimeUtils.getNineHoursDayEnd(null);
        return getRandomTime(number, start, end);
    }


    public static List<Long> getFixedWorkingDayRandomTime(int number) {
        final long start = TimeUtils.getWorkingDayStartTime();
        final long end = TimeUtils.getWorkingDayEndTime();
        return getRandomTime(number, start, end);
    }

    public static List<Long> getRandomTime(int number, long start, long end) {
        //Time is used instead of Date because of toString
        final List<Long> times = new ArrayList<Long>();
        for (int i = 0; i < number; i++) {
            final long time = new RandomNumber().getFromRange(start, end);
            times.add(time);
        }
        return times;
    }


}
