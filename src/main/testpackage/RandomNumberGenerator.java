package testpackage;

import testpackage.content.repetition.RandomNumber;

import java.util.Arrays;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:10 PM
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
//        System.out.println(new RandomNumber().getFromRange(0, 65535));
        System.out.println(Arrays.toString(new RandomNumber().getFromRange(1, 0, 6)));
    }

}