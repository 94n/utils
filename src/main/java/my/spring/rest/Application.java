package my.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Max Titov 3/17/14 3:27 PM
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		args = new String[] { "--server.port=9000" };
		SpringApplication.run(Application.class, args);
	}
}
