package my.core.repetition;

/**
 * Created by m on 03.08.2016 0:05.
 */
//8 Functional interfaces
@FunctionalInterface
public interface StringChecker {

    boolean check(String s, Character[] lowerSet, Character[] higherSet);

}
