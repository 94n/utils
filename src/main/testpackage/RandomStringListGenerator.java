package testpackage;

import testpackage.content.repetition.stringlists.InterviewQuestions;
import testpackage.content.repetition.stringlists.StringListGenerator;
import testpackage.content.repetition.stringlists.StringType;
import testpackage.content.repetition.stringlists.StringTypeInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * User: mtitov
 * Date: 10/31/11
 * Time: 12:22 PM
 */
public class RandomStringListGenerator {

    public static void main(String[] args) {
//        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.TRAINING, StringType.TRAINING.getList().length);
        System.out.println(StringType.TRAINING.getList().length);
//        StringListGenerator.shufflePrintStrings(PuzataHataFood.ALL, 3);//3,1
//        printChildrenStuff();
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
        final List<String> passiveBalanceProgram = StringListGenerator.getRandomStringList(StringType.PASSIVE_BALANCE_PROGRAM, count);
        final List<String> russianBooks = StringListGenerator.getRandomStringList(StringType.BOOKS, count);
        final List<String> englishBooks = StringListGenerator.getRandomStringList(StringType.ENGLISH_BOOKS, count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + zaytsev.get(i));
            System.out.println("   " + simpleGames.get(i));
            System.out.println("   " + passiveBalanceProgram.get(i));
            System.out.println("   " + russianBooks.get(i) + " / " + englishBooks.get(i));
        }
    }

    private static void printInterviewQuestions() {
        final List<String> questions = new ArrayList<String>();
//        addQs(questions, InterviewQuestions.ACTION_SCRIPT);
//        addQs(questions, InterviewQuestions.AJAX);
//        addQs(questions, InterviewQuestions.ANDROID);
//        addQs(questions, InterviewQuestions.ANT);
        addQs(questions, InterviewQuestions.ARCHITECTURE);
//        addQs(questions, InterviewQuestions.AUTO_IT);
//        addQs(questions, InterviewQuestions.C);
//        addQs(questions, InterviewQuestions.COLLECTIONS);
//        addQs(questions, InterviewQuestions.CONCURRENCY);
//        addQs(questions, InterviewQuestions.CPLUSPLUS);
//        addQs(questions, InterviewQuestions.CRYPTOGRAPHY);
        addQs(questions, InterviewQuestions.CSHARP);
        addQs(questions, InterviewQuestions.CSS);
        addQs(questions, InterviewQuestions.DB);
        addQs(questions, InterviewQuestions.DEBUGGING);
        addQs(questions, InterviewQuestions.DELPHI_ACTIVEX);
        addQs(questions, InterviewQuestions.DELPHI_API);
        addQs(questions, InterviewQuestions.DELPHI_COM);
        addQs(questions, InterviewQuestions.DELPHI_COM_PLUS);
        addQs(questions, InterviewQuestions.DELPHI_DCOM);
        addQs(questions, InterviewQuestions.DELPHI_OLE);
        addQs(questions, InterviewQuestions.DELPHI_TCP);
        addQs(questions, InterviewQuestions.DELPHI_UDP);
        addQs(questions, InterviewQuestions.EJB);
//        addQs(questions, InterviewQuestions.ESTIMATION);
        addQs(questions, InterviewQuestions.EXT_JS);
        addQs(questions, InterviewQuestions.FIREBIRD);
        addQs(questions, InterviewQuestions.HIBERNATE);
        addQs(questions, InterviewQuestions.HTML);
        addQs(questions, InterviewQuestions.INFORMIX);
//        addQs(questions, InterviewQuestions.IOS);
        addQs(questions, InterviewQuestions.JAVA);
        addQs(questions, InterviewQuestions.JAVA_EE);
        addQs(questions, InterviewQuestions.JAVASCRIPT);
        addQs(questions, InterviewQuestions.JAVA_SE);
        addQs(questions, InterviewQuestions.JBOSS);
//        addQs(questions, InterviewQuestions.JDBC);
        addQs(questions, InterviewQuestions.JQUERY);
//        addQs(questions, InterviewQuestions.JS);
//        addQs(questions, InterviewQuestions.JSON);
        addQs(questions, InterviewQuestions.JSP);
//        addQs(questions, InterviewQuestions.JUNIT);
//        addQs(questions, InterviewQuestions.LINUX);
//        addQs(questions, InterviewQuestions.MAVEN);
//        addQs(questions, InterviewQuestions.MULTITHREADING);
//        addQs(questions, InterviewQuestions.MYSQL);
        addQs(questions, InterviewQuestions.OOP);
        addQs(questions, InterviewQuestions.ORACLE);
//        addQs(questions, InterviewQuestions.PASCAL);
//        addQs(questions, InterviewQuestions.PATTERNS);
        addQs(questions, InterviewQuestions.PERL);
        addQs(questions, InterviewQuestions.PHP);
        addQs(questions, InterviewQuestions.PL_SQL);
        addQs(questions, InterviewQuestions.POSTGRESQL);
//        addQs(questions, InterviewQuestions.PROPOSALS);
//        addQs(questions, InterviewQuestions.QT);
//        addQs(questions, InterviewQuestions.RUBY);
//        addQs(questions, InterviewQuestions.SELENIUM);
        addQs(questions, InterviewQuestions.SERVLETS);
//        addQs(questions, InterviewQuestions.SOA);
//        addQs(questions, InterviewQuestions.SPRING);
        addQs(questions, InterviewQuestions.SPRING_MVC);
        addQs(questions, InterviewQuestions.SQL);
//        addQs(questions, InterviewQuestions.SWING);
//        addQs(questions, InterviewQuestions.TOMCAT);
        addQs(questions, InterviewQuestions.UML);
//        addQs(questions, InterviewQuestions.UNIX_SHELL_SCRIPTING);
        addQs(questions, InterviewQuestions.WEBLOGIC);
        addQs(questions, InterviewQuestions.WEB_SERVICES);
        addQs(questions, InterviewQuestions.WIN_API);
        addQs(questions, InterviewQuestions.WIN_FORMS);
        addQs(questions, InterviewQuestions.WSDL);
        addQs(questions, InterviewQuestions.XHTML);
        addQs(questions, InterviewQuestions.XML);
        for (String s : questions) {
            System.out.println(s);
        }
    }

    private static void addQs(List<String> questions, StringTypeInterface stringType) {
        final int count = 2;
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(stringType, count));
    }

}
