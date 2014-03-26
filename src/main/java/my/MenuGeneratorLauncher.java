package my;

import my.core.MenuGenerator;

/**
 * User: mtitov
 * Date: 12/26/11
 * Time: 6:16 PM
 */
public class MenuGeneratorLauncher {

    public static void main(String[] args) {
        for (String dish : MenuGenerator.getMenu()) {
            System.out.println(dish);
        }
    }

}