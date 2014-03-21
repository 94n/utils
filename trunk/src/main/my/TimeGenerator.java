package my;

import my.core.repetition.RandomTimeGenerator;

import java.util.Date;

/**
 * User: mtitov Date: 10/31/11 Time: 1:48 PM
 */
public class TimeGenerator {

	public static void main(String[] args) {
        System.out.println(new Date() + ":");
//		RandomTimeGenerator.printFixedWorkingDayRandomTimeFromNow(1);// tennis
		RandomTimeGenerator.printHour();// intelligence
	}

}
