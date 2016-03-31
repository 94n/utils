package my.core.repetition;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mtitov Date: 10/31/11 Time: 1:40 PM
 */
public class RandomTimeGenerator {

	public static List<Long> getRandomTime(int number, long start, long end) {
		final List<Long> times = new ArrayList<Long>();
		for (int i = 0; i < number; i++) {
			final long time = new RandomNumber().getFromRange(start, end);
			times.add(time);
		}
		return times;
	}

}
