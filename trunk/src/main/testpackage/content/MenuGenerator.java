package testpackage.content;

import testpackage.content.repetition.RandomNumber;
import testpackage.content.repetition.core.RandomObjectListGenerator;
import testpackage.content.repetition.stringlists.PuzataHataFood;
import testpackage.content.repetition.stringlists.StringListGenerator;
import testpackage.content.repetition.stringlists.StringType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * User: mtitov
 * Date: 12/26/11
 * Time: 6:05 PM
 */
public class MenuGenerator {

    private static final int MAX_NUMBER_OF_DISHES = StringType.DISH_TYPES.size();

    public static List<String> getMenu() {
        final int numberOfDishes = 3;//new RandomNumber().getFromRange(1, MAX_NUMBER_OF_DISHES);
        final List<StringType> dishTypesList = new ArrayList<StringType>();
        if (numberOfDishes == 1) {
            dishTypesList.add(StringType.B_SOUPS);
        } else {
            dishTypesList.addAll(RandomObjectListGenerator.generateRandomListWithUniqueElements(
                    StringType.DISH_TYPES.toArray(new StringType[MAX_NUMBER_OF_DISHES]), numberOfDishes));
        }
        Collections.sort(dishTypesList);
        final List<String> menu = new ArrayList<String>();
        for (Object stringType : dishTypesList) {
            menu.add(stringType + ": " + StringListGenerator.getRandomStringList((StringType) stringType, 1).get(0));
        }
        return menu;
    }

    public static List<String> getDietMenu() {
        final List<StringType> dishTypesList = new ArrayList<StringType>();
        dishTypesList.add(StringType.A_SALADS);
        dishTypesList.add(StringType.B_SOUPS);
        final List<String> menu = new ArrayList<String>();
        for (Object stringType : dishTypesList) {
            menu.add(StringListGenerator.getRandomStringList((StringType) stringType, 1).get(0));
        }
        return menu;
    }

    public static List<String> getRandomPuzataHataDishes() {
        final List<String> allItems = new ArrayList<String>();
        for (PuzataHataFood puzataHataFoodDishType : PuzataHataFood.values()) {
            Collections.addAll(allItems, puzataHataFoodDishType.getList());
        }
        Collections.shuffle(allItems);
        return allItems;
    }

}
