package testpackage;

import testpackage.content.repetition.RandomNumber;
import testpackage.content.repetition.stringlists.InterviewQuestions;
import testpackage.content.repetition.stringlists.StringListGenerator;
import testpackage.content.repetition.stringlists.StringType;
import testpackage.content.repetition.stringlists.StringTypeInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        printChildrenStuff();
//        printInterviewQuestions();
//        StringListGenerator.shufflePrintStrings(StringType.BOOKS, 8);
//        StringListGenerator.shufflePrintStrings(StringType.WORDS, 1);//1.1
//        StringListGenerator.shufflePrintStrings(StringType.WALLPAPERS, 1);
//        StringListGenerator.shufflePrintStrings(StringType.KNOWLEDGE_AREAS, 1);
//        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.MUSIC_STYLES, StringType.MUSIC_STYLES.getList().length);
//        StringListGenerator.shufflePrintStrings(StringType.KISA_PUZZLES, 2);//2.2
    }

    private static void printChildrenStuff() {
        final int count = 32;
        final List<String> zaytsev = StringListGenerator.getRandomStringList(StringType.ZAYTSEV_GAMES, count);
        final List<String> simpleGames = StringListGenerator.getRandomStringList(StringType.GAMES, count);
//        final List<String> passiveBalanceProgram = StringListGenerator.getRandomStringList(StringType.BALANCE_PROGRAM, count);
        final List<String> russianBooks = StringListGenerator.getRandomStringList(StringType.BOOKS, count);
        final List<String> englishBooks = StringListGenerator.getRandomStringList(StringType.ENGLISH_BOOKS, count);
        final List<String> logicBooks = StringListGenerator.getRandomStringList(StringType.LOGIC_BOOKS, count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ")");
            System.out.println("карточки");
            System.out.println("счет");
            System.out.println("сложи квадрат");
            System.out.println("кубики деревянные");
            System.out.println("   " + zaytsev.get(i));
            System.out.println("   " + simpleGames.get(i));
            System.out.println("   " + russianBooks.get(i) + " / " + englishBooks.get(i));
            final String logicBook = logicBooks.get(i);
            final int logicPage = new RandomNumber().getFromRange(1, Integer.parseInt(logicBook.substring(logicBook.indexOf(',') + 1)));
            System.out.println("   " + logicBooks.get(i) + "." + logicPage);
        }
    }

    private static void printInterviewQuestions() {
        final List<String> questions = new ArrayList<String>();
//        addQs(questions, InterviewQuestions.JUNIOR_JAVA_WEB_DESKTOP);
        addQs(questions, InterviewQuestions.INTERMEDIATE_JAVA_WEB_DESKTOP);
//        addQs(questions, InterviewQuestions.SENIOR_JAVA_WEB_DESKTOP);
        Collections.sort(questions);
        final int firstEnglishQuestionNumber = new RandomNumber().getFromRange(1, questions.size() - 2);
        final int i = 1;
        for (String s : questions) {
            if (isInEnglishRange(firstEnglishQuestionNumber, i)) {
                System.out.println("ENGLISH");
            }
            System.out.println(s);
        }
    }

    private static boolean isInEnglishRange(int firstEnglishQuestionNumber, int i) {
        return i == firstEnglishQuestionNumber || i == firstEnglishQuestionNumber + 1 || i == firstEnglishQuestionNumber + 2;
    }

    private static void addQs(List<String> questions, StringTypeInterface stringType) {
        final int count = 40;//40 per hour
        //мало 32,
        //много 99, 64, 48
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElements(stringType, count));
    }

    //Topic order
//    SDLC
//            Estimation
//    Requirements
//            OOD
//    DB Design
//    Language
//    Refactoring
//            Concurrency
//    Networking
//    Web UI
//    Web server applications
//    Java Enterprise Essentials
//    Spring
//    Jsf
//            SOAP
//    Rest
//            Desktop
//    SQL
//            JPA and DB access
    //Big data
//    Testing
//    build(+maven)
//    VCS
}
