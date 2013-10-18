package testpackage.content.repetition.stringlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA. User: makstitoff Date: 16.09.13 Time: 21:48
 */
public class Food {

	public static final Map<String, Integer>	food	= new HashMap<String, Integer>();

	static {
		food.put("zernovuye", 1);
		food.put("ovoschi", 1);
		food.put("fruits", 1);
		food.put("milk", 1);
		food.put("meat", 1);
		food.put("boby", 1);
		food.put("oliya", 1);
		food.put("meat", 1);
		food.put("eggs", 1);
		food.put("zerno", 1);
		food.put("boby", 1);
		food.put("milk", 1);
		food.put("cheeze", 1);
		food.put("soya", 1);
		final List<String> foodList = new ArrayList<String>();
		for (Map.Entry<String, Integer> foodItem : food.entrySet()) {
			for (Integer i = 0; i < foodItem.getValue(); i++) {
				foodList.add(foodItem.getKey());
			}
		}
		Collections.shuffle(foodList);
		for (String foodItem : foodList) {
			System.out.print(foodItem + ",");
		}
	}

	public static void main(String args[]) {

	}

}
