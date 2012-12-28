package testpackage.content.repetition.core;

import java.util.*;

/**
 * Generator of random lists of objects from given collection
 * <p/>
 * User: mtitov
 * Date: 11/17/11
 * Time: 6:36 PM
 */
public class RandomObjectListGenerator {

    public static <T> List<T> generateRandomList(T[] orderedArray, int expectedLength) {
        final Random random = new Random();
        final List<T> generatedList = new ArrayList<T>();
        for (int i = 0; i < expectedLength; i++) {
            generatedList.add(orderedArray[random.nextInt(orderedArray.length)]);
        }
        return generatedList;
    }

    public static <T> List<T> generateRandomListWithUniqueElements(T[] orderedArray, int expectedLength) {
        final List<T> list = Arrays.asList(orderedArray);
        Collections.shuffle(list);
        return list.subList(0, expectedLength);
    }

}
