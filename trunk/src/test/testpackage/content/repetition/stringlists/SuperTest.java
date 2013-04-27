package testpackage.content.repetition.stringlists;

import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: makstitoff
 * Date: 17.01.13
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class SuperTest {

    public static void main(String [] args){
        String s = "sri";
    }

    static void staticMethod(){
        System.out.println("super");
    }

    public String instanceMethod(){
        return "Super instance";
    }

    public static class StaticInnerClass extends SuperTest{
        public String instanceMethod() throws BadFoodException {
            return "Inner static instance";
        }
    }

}
