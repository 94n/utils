package my.core;

/**
 * User: mtitov
 * Date: 10/26/11
 * Time: 1:45 PM
 */
public class PasswordGenerator {

    private static final int LENGTH = 8
            ;

    //1 or 2
    private static final int STRENGTH = 2
            ;

    public static void main(String[] args) {
        System.out.println(my.core.repetition.StringGenerator.generateString(LENGTH, STRENGTH));
    }

}
