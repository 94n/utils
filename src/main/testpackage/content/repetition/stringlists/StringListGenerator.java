package testpackage.content.repetition.stringlists;

import testpackage.content.repetition.core.RandomObjectListGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * User: mtitov
 * Date: 10/31/11
 * Time: 12:03 PM
 */
public class StringListGenerator {

    public static void shufflePrintStrings(StringTypeInterface stringType, int numberOfStrings) {
        final List<String> randomStringList = getRandomStringList(stringType, numberOfStrings);
        for (String s : randomStringList) {
            System.out.println(s);
        }
    }

    public static void shufflePrintStrings(StringTypeInterface stringType) {
        final List<String> randomStringList = getRandomStringList(stringType);
        for (String s : randomStringList) {
            System.out.println(s);
        }
    }

    public static void shufflePrintStringsWithUniqueElements(StringType stringType, int numberOfStrings) {
        final List<String> randomStringList = getRandomStringListWithUniqueElements(stringType, numberOfStrings);
        for (String s : randomStringList) {
            System.out.println(s);
        }
    }

    public static void shufflePrintStringsWithUniqueElements(StringType stringType) {
        final List<String> randomStringList = getRandomStringListWithUniqueElements(stringType);
        for (String s : randomStringList) {
            System.out.println(s);
        }
    }

    public static void alphabeticPrintStrings(StringType stringType, int numberOfStrings) {
        final String[] strings = stringType.getList();
        System.out.println(numberOfStrings + "/" + strings.length);
        Collections.sort(Arrays.asList(strings));
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println(strings[i]);
        }
    }

    public static List<String> getRandomStringList(StringTypeInterface stringType, int numberOfStrings) {
        final String[] strings = stringType.getList();
        return RandomObjectListGenerator.generateRandomList(strings, numberOfStrings);
    }

    public static List<String> getRandomStringList(StringTypeInterface stringType) {
        final String[] strings = stringType.getList();
        return RandomObjectListGenerator.generateRandomList(strings);
    }

    public static List<String> getRandomStringListWithUniqueElements(StringType stringType, int numberOfStrings) {
        final String[] strings = stringType.getList();
        return RandomObjectListGenerator.generateRandomListWithUniqueElements(strings, numberOfStrings);
    }

    public static List<String> getRandomStringListWithUniqueElements(StringTypeInterface stringType, int numberOfStrings) {
        final String[] strings = stringType.getList();
        return RandomObjectListGenerator.generateRandomListWithUniqueElements(strings, numberOfStrings);
    }

    public static List<String> getRandomStringListWithUniqueElements(StringType stringType) {
        final String[] strings = stringType.getList();
        return RandomObjectListGenerator.generateRandomListWithUniqueElements(strings);
    }

    public static List<String> getRandomStringListWithUniqueElementsAndTypeName(StringTypeInterface stringType, int numberOfStrings) {
        final String[] strings = stringType.getList();
        for(int i=0;i<strings.length;i++){
            strings[i] = stringType + ": " + strings[i];
        }
        return RandomObjectListGenerator.generateRandomListWithUniqueElements(strings, numberOfStrings);
    }

}
