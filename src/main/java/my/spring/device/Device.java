package my.spring.device;

import my.core.repetition.RandomNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Max Titov 3/21/14 3:05 PM
 */
@ComponentScan
@EnableAutoConfiguration
public class Device {

	public static void main(String[] args) {
        args = new String[] { "--server.port=" + new RandomNumber().getFromRange(0, 65535)};
		SpringApplication.run(Device.class, args);
	}

}
