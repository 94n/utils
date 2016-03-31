package my.core;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class TimeUtils {

    public static Duration getSportTimeCountingSecondPerDaySinceThirty() {
        return Duration.ofSeconds(getDaySinceThirty());
    }

    public static long getDaySinceThirty() {
        return Duration.between(LocalDateTime.of(2014, Month.APRIL, 12, 0, 0), LocalDateTime.now()).toDays() + 1;
    }

}
