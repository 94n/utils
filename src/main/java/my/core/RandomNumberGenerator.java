package my.core;

import my.core.repetition.RandomNumber;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:10 PM
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
        System.out.println(new RandomNumber().getFromRange(1, 10));
    }

}