package testpackage;

import testpackage.content.repetition.RandomNumber;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:10 PM
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
//        System.out.println(new RandomNumber().getFromRange(0, 1));shop
//        System.out.println(new RandomNumber().getFromRange(240, 600));//sleep
        for (int i : new RandomNumber().getFromRange(8, 7, 16)) {
            System.out.print(i + " ");
        }
    }

}