package testpackage.content.repetition.stringlists;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: makstitoff
 * Date: 17.01.13
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class SomeTest {

    @Test
    public void test() throws BadFoodException {
        try{
            reverse("");
        } catch(IllegalArgumentException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    private String reverse(String string) throws BadFoodException {
        if (string.isEmpty()) {
            throw new BadFoodException();
        }
        String reverseStr = "";
        for (int i = string.length() - 1; i >= 0; --i) {
            reverseStr += string.charAt(i);
        }
        return reverseStr;
    }

}
