package my.core.repetition;

import my.core.repetition.core.RandomObjectListGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Время полного перебора всех возможных паролей заданного алфавита при скорости перебора 10,000,000 паролей в секунду
 * 62 (латиница разного регистра плюс цифры)
 * 6 символов 95 мин - мало
 * 8 символов 252 суток 17 часов
 * 10 символов 2,661 год
 * <p/>
 * Хороший пароль - от 8 символов из цифр и букв обоих регистров
 * <p/>
 * User: mtitov
 * Date: 10/26/11
 * Time: 1:41 PM
 */
public class StringGenerator {

    /**
     * Minimum length of password.
     */
    private static final int MIN_LENGTH = 8;

    private static final Character[] CHARACTERS_STRENGTH_1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_3 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_4 = {'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`','{', '|', '}', '~',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static StringChecker symbolChecker = (s, lowerSet, higherSet) -> {
        List<Character> items = new ArrayList<>(Arrays.asList(higherSet));
        items.removeAll(Arrays.asList(lowerSet));
        for (Character symbol : items) {
            if (s.contains(symbol.toString())) {
                return true;
            }
        }
        return false;
    };

    public static String generateString(int length, int type) {
        return generateString(length, type, false);
    }

    public static String generateString(int length, int type, boolean includeAllKinds) {
        Character[][] symbolSets = {CHARACTERS_STRENGTH_1, CHARACTERS_STRENGTH_2, CHARACTERS_STRENGTH_3, CHARACTERS_STRENGTH_4};
        Character[] genBase = symbolSets[type - 1];
        String gen = getString(length, genBase);
        if (includeAllKinds && type > 1) {
            while (!symbolChecker.check(gen, symbolSets[type - 2], genBase)) {
                System.out.println(gen);
                gen = getString(length, genBase);
            }
        } else {
            return gen;
        }
        return gen;
    }

    public static String getString(int length, Character[] characters) {
        final StringBuilder stringBuilder = new StringBuilder();
        final List<Character> randomCharacterList = RandomObjectListGenerator.generateRandomList(characters, length);
        randomCharacterList.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    private static int getLength(int minimumLength, int maximumLength) {
        final Random random = new Random();
        return random.nextInt(maximumLength - minimumLength + 1) + minimumLength;
    }

}
