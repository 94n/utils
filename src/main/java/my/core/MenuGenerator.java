package my.core;

import my.core.repetition.core.RandomObjectListGenerator;
import my.core.repetition.stringlists.PuzataHataFood;
import my.core.repetition.stringlists.StringListGenerator;
import my.core.repetition.stringlists.StringType;

import java.util.ArrayList;
import java.util.Collections;
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
            dishTypesList.add(StringType.SOUPS);
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
        dishTypesList.add(StringType.SALADS);
        dishTypesList.add(StringType.SOUPS);
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
