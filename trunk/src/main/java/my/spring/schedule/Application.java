package my.spring.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * User: makstitoff
 * Date: 20.03.14
 * Time: 22:58
 */
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ScheduledTasks.class);
    }
}
