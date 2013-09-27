package testpackage.content.repetition.stringlists;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: makstitoff
 * Date: 16.09.13
 * Time: 21:48
 */
public class Food {

    public static final Map<String, Integer> food = new HashMap<String, Integer>();

    static {
        food.put("Вода", 1);
        food.put("чай", 1);
        food.put("какао", 1);
        food.put("молоко", 1);
        food.put("бульйон", 1);
        food.put("яйця некруто відвареної рнс", 1);
        food.put("риба річкова відварна", 1);
        food.put("Кава ", 1);
        food.put("какао з молоком", 1);
        food.put("какао з вершками", 1);
        food.put("яйця круто", 1);
        food.put("яєшня", 1);
        food.put("омлет", 1);
        food.put("риба морська відварна", 1);
        food.put("картопля відварна", 1);
        food.put("телятина", 1);
        food.put("хліб пшеничний", 1);
        food.put("Відварна курка", 1);
        food.put("відварна яловичина", 1);
        food.put("хліб житній", 1);
        food.put("яблука", 1);
        food.put("морква", 1);
        food.put("редис", 1);
        food.put("шпинат", 1);
        food.put("огірки", 1);
        food.put("картопля смажена", 1);
        food.put("ветчину", 1);
        food.put("Смажене м'ясо", 1);
        food.put("дичину", 1);
        food.put("оселедець", 1);
        food.put("пюре горохове", 1);
        food.put("тушковані боби", 1);
        food.put("Шпик", 1);
        food.put("гриби", 1);
        food.put("мучное", 1);
        food.put("Овочі", 1);
        food.put("фрукти", 1);
        food.put("Олія", 1);
        food.put("Масло", 1);
        food.put("цукор", 1);
        food.put("ягоди", 1);
        food.put("макарони", 1);
        food.put("крупы", 1);
        food.put("виноград", 1);
        final List<String> foodList = new ArrayList<String>();
        for (Map.Entry<String, Integer> foodItem : food.entrySet()) {
            for (Integer i = 0; i <= foodItem.getValue(); i++) {
                foodList.add(foodItem.getKey());
            }
        }
        Collections.shuffle(foodList);
        for(String foodItem : foodList){
            System.out.print(foodItem + ",");
        }
    }

    public static void main(String args []){

    }

}
