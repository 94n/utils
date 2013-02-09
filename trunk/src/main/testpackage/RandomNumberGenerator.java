package testpackage;

import testpackage.content.TimeUtils;
import testpackage.content.repetition.RandomNumber;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:10 PM
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
//        System.out.println(new RandomNumber().getFromRange(0, 1));shop
        System.out.println(new RandomNumber().getFromRange(240, 600));//sleep
//        for (int i : new RandomNumber().getFromRange(7, 5, 14)) {
//            System.out.print(i + " ");
//        }
    }

}