package testpackage.content.repetition.stringlists;

/**
 * Created with IntelliJ IDEA.
 * User: makstitoff
 * Date: 31.03.13
 * Time: 22:00
 * To change this template use File | Settings | File Templates.
 */
public class SubTest extends SuperTest {

    public static void main(String [] args){
        System.out.printf("12%1$s", "13%1$s", "14%1$s");
        System.out.println();
    }

    public static void staticMethod() throws NullPointerException{
        System.out.println("sub");
    }

}
