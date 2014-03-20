package testpackage.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Max Titov 3/17/14 3:13 PM
 */
@Controller
public class GreetingController {

	private static final String	template	= "Hello, %s!";
	private final AtomicLong	counter		= new AtomicLong();

	@RequestMapping("/greeting")
	public @ResponseBody
	Greeting greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
