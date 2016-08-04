package my;

import my.core.repetition.RandomNumber;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by m on 04.08.2016 8:48.
 */
public class LambdaTests {

    private static BiFunction<Integer, Integer, Integer> sumQuantities = (Integer x, Integer y) -> {
        return x + y;
    };

    public static void main(String[] args) {

    }

    private static void applySpecifiedTypes() {
        List<Integer> ints = Arrays.asList(new RandomNumber().getFromRange(10, 1, 100));
        ints.stream().forEach(x -> {
            System.out.println(sumQuantities.apply(x, 100));
        });
    }

}