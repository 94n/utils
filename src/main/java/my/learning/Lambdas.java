package my.learning;

import my.core.repetition.RandomNumber;
import my.core.repetition.StringGenerator;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Created by m on 04.08.2016 8:48.
 */
//8 Lambdas
public class Lambdas {

    private static Consumer<Object> p = System.out::println;

    //Constructor reference
    //Equivalent lambda expression: () -> new RandomNumber()
    //Supplier<T> - with nothing as input, return a T
    private static Supplier<RandomNumber> randomFactory = RandomNumber::new;
    private static Supplier<Integer> randomPercent = () -> randomFactory.get().getFromRange(0, 100);

    //Comma-separated list of inputs with specified types on the left, a block with a return on the right:
    private static BiFunction<Integer, Integer, Integer> specified = (Integer x, Integer y) -> {
        return x + y;
    };

    //Comma-separated list of inputs with inferred types on the left, a return value on the right:
    private static BiFunction<Integer, Integer, Integer> multipleInferred = (x, y) -> x + y;

    //Single parameter with inferred type on the left, a return value on the right:
    //Function<T, R> - take a T as input, return an R as output
    private static Function<Integer, Integer> singleInferredReturn = x -> x * x;

    //No inputs on left (official name: "burger arrow"), return value on the right:
    private static Supplier<Integer> burgerArrow = () -> randomFactory.get().getFromRange(1, 100);

    //Single parameter with inferred type on the left, a block with no return (void return) on the right:
    //IntConsumer - take an int as input, perform some action and don't return anything
    private static IntConsumer voidSingleInferred = x -> {
        p.accept("voidSingleInferred:" + Math.pow(x, x));
    };

    //Consumer<T> - take a T as input, perform some action and don't return anything
    private static Consumer<String> printer = s -> p.accept("----------" + s + "-----------");

    //Static method reference:
    //Equivalent lambda expression: x, y -> StringGenerator.generateString(x,y)
    private static BiFunction<Integer, Integer, String> staticMethodReference = StringGenerator::generateString;

    //Predicate<T> - take a T as input, return a boolean as output
    private static Predicate<Integer> isBig = x -> x > 1000;

    //BinaryOperator<T> - take two T's as input, return one T as output, useful for "reduce" operations
    private static BinaryOperator<Integer> rightTriangleAreaCalc = (x, y) -> x * y / 2;

    public static void main(String[] args) {
        applySpecifiedTypes();
        applyMultipleInferredTypes();
        applySingleInferredTypes();
        applyBurgerArrow();
        applyVoidSingleInferred();
        applyStaticMethodReference();
        applyNonStaticMethodReference();
        applyCapturingMethodReference();
        applyCapturingLambda();
        controlFlow(Arrays.asList("a", "b", "c"));
        applyPredicate();
        applyBinaryOperator();
        applyConsumer();
    }

    private static void applySpecifiedTypes() {
        List<Integer> ints = Arrays.asList(randomFactory.get().getFromRange(10, 1, 100));
        ints.stream().forEach(x -> {
            p.accept(specified.apply(x, 100));
        });
    }

    private static void applyMultipleInferredTypes() {
        List<Integer> ints = Arrays.asList(randomFactory.get().getFromRange(10, 1, 100));
        ints.stream().forEach(x -> {
            p.accept(multipleInferred.apply(x, 200));
        });
    }

    private static void applySingleInferredTypes() {
        List<Integer> ints = Arrays.asList(randomFactory.get().getFromRange(10, 1, 100));
        ints.stream().forEach(x -> {
            p.accept(singleInferredReturn.apply(x));
        });
    }

    private static void applyBurgerArrow() {
        p.accept(burgerArrow.get());
    }

    private static void applyVoidSingleInferred() {
        voidSingleInferred.accept(randomFactory.get().getFromRange(1, 10));
    }

    private static void applyStaticMethodReference() {
        p.accept(staticMethodReference.apply(50, 4));
    }

    private static void applyNonStaticMethodReference() {
        String[] stringArray = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};
        //Non-static method reference
        //Equivalent lambda expression: (x, y) -> x.compareToIgnoreCase(y)
        Arrays.sort(stringArray, String::compareToIgnoreCase);
    }

    private static void applyCapturingMethodReference() {
        String[] stringArray = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};
        class ComparisonProvider {
            private int compareByName(String a, String b) {
                return a.compareTo(b);
            }
        }
        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        //Capturing method reference
        //Equivalent lambda expression: (x, y) -> myComparisonProvider.compareByName(x, y)
        Arrays.sort(stringArray, myComparisonProvider::compareByName);
    }

    private static void applyCapturingLambda() {
        List<Integer> ints = Arrays.asList(randomFactory.get().getFromRange(10, 1, 100));
        int y = 314;
        //y+=1;
        ints.stream().forEach(x -> {
            p.accept(singleInferredReturn.apply(x + y));
        });
    }

    private static void nonFinalVariableCapture() {
        int count = 0;
        List<String> strings = Arrays.asList("a", "b", "c");
        strings.forEach(s -> {
            //count++; // error: can't modify the value of count
        });
    }

    private static void exceptionTransparency(Iterable<String> values, Appendable out) throws IOException {
        values.forEach(s -> {
            //out.append(s); // error: can't throw IOException here
            // Consumer.accept(T) doesn't allow it
        });
    }

    private static void controlFlow(Iterable<String> values) {
        String word = "b";
        values.forEach(s -> {
            if (word.equals(s)) {
                return; // want to end the loop but can't - return means 'continue'
            }
            p.accept(s);
        });
    }

    private static void abstractInstantiation(Iterable<String> values) {
        abstract class A<T> {
            abstract T get();
        }
        //A<String> test = () -> "test"; //can't instantiate abstract class with lambda, can lead to constructor execution
    }

    private static void applyPredicate() {
        int number = randomFactory.get().getFromRange(1, 2000);
        p.accept(number + " is big: " + isBig.test(number));
    }

    private static void applyBinaryOperator() {
        RandomNumber generator = randomFactory.get();
        int a = generator.getFromRange(1, 100);
        int b = generator.getFromRange(1, 100);
        p.accept("Right triangle area, legs = " + a + " and " + b + ": " + rightTriangleAreaCalc.apply(a, b));
    }

    private static void applyConsumer() {
        printer.accept(StringGenerator.generateString(100, 2));
    }

}