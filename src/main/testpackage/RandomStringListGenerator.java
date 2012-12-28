package testpackage;

import testpackage.content.repetition.stringlists.PuzataHataFood;
import testpackage.content.repetition.stringlists.StringListGenerator;
import testpackage.content.repetition.stringlists.StringType;

import java.util.List;

/**
 * User: mtitov
 * Date: 10/31/11
 * Time: 12:22 PM
 */
public class RandomStringListGenerator {

    public static void main(String[] args) {
        StringListGenerator.shufflePrintStrings(PuzataHataFood.ALL, 2);//2.2
//        printChildrenStuff();
//        StringListGenerator.shufflePrintStrings(StringType.TOYS, 32);
//        StringListGenerator.shufflePrintStrings(StringType.WALLPAPERS, 1);
//        StringListGenerator.shufflePrintStrings(StringType.KNOWLEDGE_AREAS, 1);
//        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.MUSIC_STYLES, StringType.MUSIC_STYLES.getList().length);
//        StringListGenerator.shufflePrintStrings(StringType.KISA_PUZZLES, 2);//2.2
    }

    private static void printChildrenStuff() {
        final int count = 64;
        final List<String> zaytsev = StringListGenerator.getRandomStringList(StringType.ZAYTSEV_GAMES, count);
        final List<String> simpleGames = StringListGenerator.getRandomStringList(StringType.GAMES, count);
        final List<String> passiveBalanceProgram = StringListGenerator.getRandomStringList(StringType.PASSIVE_BALANCE_PROGRAM, count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + zaytsev.get(i));
            System.out.println("   " + simpleGames.get(i));
            System.out.println("   " + passiveBalanceProgram.get(i));
        }
    }

}
