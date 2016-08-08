package my.core;

/**
 * User: mtitov
 * Date: 10/31/11
 * Time: 12:22 PM
 */
public class RandomStringListGenerator {

    public static void main(String[] args) {
//        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.TRAINING, StringType.TRAINING.getList().length);
//        System.out.println(StringType.TRAINING.getList().length);
//        StringListGenerator.shufflePrintStrings(PuzataHataFood.ALL, 3);//3,1
//                StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.TEMP, 3);//3,1
//        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.RECIPES);
//        printInterviewQuestions();
//        StringListGenerator.shufflePrintStrings(StringType.BOOKS, 8);
//        StringListGenerator.shufflePrintStrings(StringType.WORDS, 1);//1.1
//        StringListGenerator.shufflePrintStrings(StringType.WALLPAPERS, 1);
//        StringListGenerator.shufflePrintStrings(StringType.KNOWLEDGE_AREAS, 1);
//        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.MUSIC_STYLES, StringType.MUSIC_STYLES.getList().length);
//        StringListGenerator.shufflePrintStrings(StringType.KISA_PUZZLES, 2);//2.2
    }

    private static boolean isInEnglishRange(int firstEnglishQuestionNumber, int i) {
        return i == firstEnglishQuestionNumber || i == firstEnglishQuestionNumber + 1 || i == firstEnglishQuestionNumber + 2;
    }

}
