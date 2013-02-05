package testpackage;

import testpackage.content.TimeUtils;
import testpackage.content.repetition.RandomNumber;

import java.util.Arrays;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:10 PM
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
//        System.out.println(new RandomNumber().getFromRange(0, 360));
        for (int i : new RandomNumber().getFromRange(6, 3, 12)) {
            System.out.print(i + " ");
        }
    }

}