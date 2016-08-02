package my.core.repetition;

import my.core.repetition.core.RandomObjectListGenerator;

import java.util.Collections;
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

    private static final Character[] CHARACTERS_STRENGTH_1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_3 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
            'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_4 = {'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',',
            '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B',
            'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};

    StringChecker digitChecker = (s) -> !Collections.disjoint(list1, list2);;

    public static String generateString(int length, int type) {
        return generateString(length, type, false);
    }

    public static String generateString(int length, int type, boolean includeAllKinds) {
        String gen = null;
        Character[] genBase = null;
        if (type == 1) {
            genBase = CHARACTERS_STRENGTH_1;
        } else if (type == 2) {
            genBase = CHARACTERS_STRENGTH_2;
        } else if (type == 3) {
            genBase = CHARACTERS_STRENGTH_3;
        } else if (type == 4) {
            genBase = CHARACTERS_STRENGTH_4;
        }
        gen = getString(length, genBase);
        while(includeAllKinds && !)
        return gen;
    }

    public static String getString(int length, Character[] characters) {
        final StringBuilder stringBuilder = new StringBuilder();
        final List<Character> randomCharacterList = RandomObjectListGenerator.generateRandomList(characters, length);
        for (Character character : randomCharacterList) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    private static int getLength(int minimumLength, int maximumLength) {
        final Random random = new Random();
        return random.nextInt(maximumLength - minimumLength + 1) + minimumLength;
    }

}
