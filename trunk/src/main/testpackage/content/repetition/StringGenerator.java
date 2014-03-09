package testpackage.content.repetition;

import testpackage.content.repetition.core.RandomObjectListGenerator;

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

    private static final Character[] CHARACTERS_STRENGTH_1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a',
            'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};

    private static final Character[] CHARACTERS_STRENGTH_2 = {'!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+',
            ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'};

    //17k6G5oW
    //
    //SjsAkOHt96
    //
    //zHjt54JxeZ
    //

    /**
     * Maximum length of password. Equals to maximum minimum found :)
     */
    private static final int MAX_LENGTH = 10;

    public static String getName(int length) {
        return getString(length, CHARACTERS_STRENGTH_1);
    }

    public static String getPassword() {
        final int length = 6;
        return getString(length, CHARACTERS_STRENGTH_2);
    }

    public static String getPassword(int length, int type) {
        if (type == 1) {
            return getString(length, CHARACTERS_STRENGTH_1);
        } else {
            return getString(length, CHARACTERS_STRENGTH_2);
        }
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
