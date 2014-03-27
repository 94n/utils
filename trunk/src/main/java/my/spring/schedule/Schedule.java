package my.spring.schedule;

import my.core.repetition.RandomNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * User: makstitoff
 * Date: 20.03.14
 * Time: 22:58
 */
@EnableAutoConfiguration
public class Schedule {
    public static void main(String[] args) throws Exception {
        args = new String[] { "--server.port=" + new RandomNumber().getFromRange(0, 65535)};
        SpringApplication.run(new Object[]{Schedule.class, ScheduledTasks.class}, args);
    }
}
