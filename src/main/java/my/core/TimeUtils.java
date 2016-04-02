package my.core;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class TimeUtils {

    public static List<LocalDateTime> getTimePoints(String seed, LocalDate startDate) {
        List<LocalDateTime> timePoints = new ArrayList<>();
        LocalDate datePoint = startDate;
        for (int i = 0; i < seed.length() - 3; i++) {
            LocalDateTime nextPoint = getNextPoint(seed, timePoints, datePoint, i);
            timePoints.add(nextPoint);
            datePoint = nextPoint.toLocalDate();
        }
        return timePoints;
    }

    public static Duration getSportTimeCountingSecondPerDaySinceThirty() {
        return Duration.ofSeconds(getDaySinceThirty());
    }

    public static long getDaySinceThirty() {
        return Duration.between(LocalDateTime.of(2014, Month.APRIL, 12, 0, 0), LocalDateTime.now()).toDays() + 1;
    }

    private static LocalDateTime getNextPoint(String seed, List<LocalDateTime> timePoints, LocalDate datePoint, int i) {
        LocalTime timePoint = getNextTimePoint(seed, i);
        return LocalDateTime.of(adjustDateIfPreviousDatePresent(timePoints, datePoint, timePoint), timePoint);
    }

    private static LocalDate adjustDateIfPreviousDatePresent(List<LocalDateTime> timePoints, LocalDate datePoint, LocalTime
            timePoint) {
        if (!timePoints.isEmpty()) {
            return adjustDate(timePoints, datePoint, timePoint);
        }
        return datePoint;
    }

    private static LocalDate adjustDate(List<LocalDateTime> timePoints, LocalDate datePoint, LocalTime timePoint) {
        LocalTime previousTimePoint = timePoints.get(timePoints.size() - 1).toLocalTime();
        if (previousTimePoint.isAfter(timePoint) || previousTimePoint.equals(timePoint)) {
            return datePoint.plusDays(1);
        }
        return datePoint;
    }

    private static LocalTime getNextTimePoint(String seed, int i) {
        int hour = adjustHour(Integer.valueOf("" + seed.charAt(i) + seed.charAt(i + 1)));
        int minute = adjustMinute(Integer.valueOf("" + seed.charAt(i + 2) + seed.charAt(i + 3)));
        return LocalTime.of(hour, minute);
    }

    private static int adjustMinute(int minute) {
        while (minute >= 60) {
            minute -= 60;
        }
        return minute;
    }

    private static int adjustHour(int hour) {
        while (hour >= 24) {
            hour -= 24;
        }
        return hour;
    }

}
