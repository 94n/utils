package testpackage;

import testpackage.content.repetition.stringlists.InterviewQuestions;
import testpackage.content.repetition.stringlists.PuzataHataFood;
import testpackage.content.repetition.stringlists.StringListGenerator;
import testpackage.content.repetition.stringlists.StringType;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mtitov
 * Date: 10/31/11
 * Time: 12:22 PM
 */
public class RandomStringListGenerator {

    public static void ma6in(String[] args) {
//        StringListGenerator.shufflePrintStrings(PuzataHataFood.ALL, 3);//3,1
//        printChildrenStuff();
//        printInterviewQuestions();
        StringListGenerator.shufflePrintStrings(StringType.BOOKS, 4);
//        StringListGenerator.shufflePrintStrings(StringType.WORDS, 1);//1.1
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
        final List<String> books = StringListGenerator.getRandomStringList(StringType.BOOKS, count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + zaytsev.get(i));
            System.out.println("   " + simpleGames.get(i));
            System.out.println("   " + passiveBalanceProgram.get(i));
            System.out.println("   " + books.get(i));
        }
    }

    private static void printInterviewQuestions() {
        final int count = 2;
        final List<String> questions = new ArrayList<>();
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.ACTION_SCRIPT, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.AJAX, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.ANDROID, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.ANT, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.ARCHITECTURE, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.AUTO_IT, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.C, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.COLLECTIONS, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.CONCURRENCY, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.CPLUSPLUS, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.CRYPTOGRAPHY, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.CSHARP, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.CSS, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.DB, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.DEBUGGING, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.ESTIMATION, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.HIBERNATE, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.HTML, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.IOS, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JAVA, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JAVA_EE, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JAVASCRIPT, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JAVA_SE, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JBOSS, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JDBC, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JQUERY, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JS, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JSON, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.JUNIT, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.LINUX, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.MAVEN, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.MULTITHREADING, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.MYSQL, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.OOP, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.ORACLE, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.PASCAL, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.PATTERNS, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.PHP, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.PROPOSALS, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.QT, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.RUBY, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SELENIUM, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SERVLETS, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SOA, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SPRING, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SPRING_MVC, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SQL, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.SWING, count));
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.TOMCAT, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.UNIX_SHELL_SCRIPTING, count));
//        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(InterviewQuestions.XML, count));
        for (String s : questions) {
            System.out.println(s);
        }
    }

}
