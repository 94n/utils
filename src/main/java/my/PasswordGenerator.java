package my;

/**
 * User: mtitov
 * Date: 10/26/11
 * Time: 1:45 PM
 */
public class PasswordGenerator {

    private static final int LENGTH = 6
            ;

    //1 or 2
    private static final int STRENGTH = 1
            ;

    public static void main(String[] args) {
        System.out.println(my.core.repetition.StringGenerator.generateString(LENGTH, STRENGTH));
    }

}
