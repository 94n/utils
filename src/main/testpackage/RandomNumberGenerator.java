package testpackage;

import testpackage.content.repetition.RandomNumber;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:10 PM
 */
public class RandomNumberGenerator {

    public static void main(String[] args) {
//        System.out.println(new RandomNumber().getFromRange(1, 2));//shop
//        System.out.println(new RandomNumber().getFromRange(10000, 99999));//zip code
        System.out.println(new RandomNumber().getFromRange(0, 1280));//zip code
//        for (int i : new RandomNumber().getFromRange(9, 21, 30)) {
//            System.out.print(i + " ");
//        }
    }

}