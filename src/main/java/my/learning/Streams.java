package my.learning;

import my.core.repetition.RandomNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by m on 06.08.2016 14:27.
 */
public class Streams {

    private static Supplier<List<Integer>> randomIntFactory = () -> Arrays.asList(new RandomNumber().getFromRange(10, 0,
            1000));

    /*private static Supplier<List<Long>> randomLongFactory = () -> Arrays.asList(new RandomNumber().getFromRange(10, 0,
            1000));*/

    public static void main(String[] args) {
        filter();
        map();
        flatMap();
        peek();
        distinct();
        sorted();
        limit();
        skip();
        //forEach();
    }

    private static void print(Object o) {
        System.out.println(o);
    }

    /*private static List<LocalDateTime> getSomeDates() {
        List<LocalDateTime> dates = new ArrayList<>();
        Instant.now().toEpochMilli();
        for (int i = 0; i < 10; i++) {
            dates.add(LocalDateTime.ofInstant(Instant.ofEpochMilli(gen.nextLong()), ZoneId.systemDefault()));
        }
        return dates;
    }*/

    //filter  - Exclude all elements that don't match a Predicate.
    private static void filter() {
        print(" filter");
        List<Integer> randomList = randomIntFactory.get();
        print("before:" + randomList);
        print("after:" + randomList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));
    }

    //map  - Perform a one-to-one transformation of elements using a Function.
    private static void map() {
        print(" map");
        List<Integer> randomList = randomIntFactory.get();
        print("before:" + randomList);
        print("after:" + randomList.stream().map(i -> i * i).collect(Collectors.toList()));
    }

    //flatMap  - Transform each element into zero or more elements by way of another Stream.
    private static void flatMap() {
        print(" flatMap");
        class Item {
            private String name;

            Item(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        class Order {
            private List<Item> items;

            Order(List<Item> items) {
                this.items = items;
            }

            public List<Item> getItems() {
                return items;
            }
        }
        Item item1 = new Item("1");
        Item item2 = new Item("2");
        Order order1 = new Order(Collections.singletonList(item1));
        Order order2 = new Order(Collections.singletonList(item2));
        Arrays.asList(order1, order2).stream().flatMap(order -> order.getItems().stream()).forEach(i -> print(i.getName()));
    }

    //peek  - Perform some action on each element as it is encountered. Primarily useful for debugging.
    private static void peek() {
        print(" peek");
        List<Integer> randomList = randomIntFactory.get();
        print("before:" + randomList);
        print("after:" + randomList.stream().peek(i -> System.out.println("peek:" + i)).filter(i -> i % 2 == 0).collect
                (Collectors.toList()));
    }

    //distinct  - Exclude all duplicate elements according to their .equals behavior. This is a stateful operation.
    private static void distinct() {
        print(" distinct");
        List<Integer> randomList = Arrays.asList(new RandomNumber().getFromRange(10, 0, 10));
        print("before:" + randomList);
        print("after:" + randomList.stream().distinct().collect(Collectors.toList()));
    }

    //sorted  - Ensure that stream elements in subsequent operations are encountered according to the order imposed by a
    // Comparator. This is a stateful operation.
    private static void sorted() {
        print(" sorted");
        List<Integer> randomList = randomIntFactory.get();
        print("before:" + randomList);
        print("after:" + randomList.stream().sorted().collect(Collectors.toList()));
    }

    //limit  - Ensure that subsequent operations only see up to a maximum number of elements. This is a stateful,
    // short-circuiting operation.
    private static void limit() {
        print(" limit");
        List<Integer> randomList = randomIntFactory.get();
        print("before:" + randomList);
        print("after:" + randomList.stream().limit(3).collect(Collectors.toList()));
    }

    //skip  - Ensure that subsequent operations do not see the first n elements. This is a stateful operation.
    private static void skip() {
        print("  skip");
        List<Integer> randomList = randomIntFactory.get();
        print("before:" + randomList);
        print("after:" + randomList.stream().skip(3).collect(Collectors.toList()));
    }

    //forEach  - Perform some action for each element in the stream.
    /*private static void forEach() {
        print("  forEach");
        List<LocalDateTime> dates = getSomeDates();
        print("before:" + dates);
        dates.stream().forEach(d -> d.plusDays(1));
        print("after:" + dates);
    }*/


}
