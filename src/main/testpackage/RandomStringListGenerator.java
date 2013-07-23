package testpackage;

import testpackage.content.repetition.RandomNumber;
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
        final List<String> passiveBalanceProgram = StringListGenerator.getRandomStringList(StringType.BALANCE_PROGRAM, count);
        final List<String> russianBooks = StringListGenerator.getRandomStringList(StringType.BOOKS, count);
        final List<String> englishBooks = StringListGenerator.getRandomStringList(StringType.ENGLISH_BOOKS, count);
        final List<String> logicBooks = StringListGenerator.getRandomStringList(StringType.LOGIC_BOOKS, count);
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") 1 2 3");
            System.out.println("   " + zaytsev.get(i));
            System.out.println("   " + simpleGames.get(i));
            System.out.println("   " + passiveBalanceProgram.get(i));
            System.out.println("   " + russianBooks.get(i) + " / " + englishBooks.get(i));
            final String logicBook = logicBooks.get(i);
            final int logicPage = new RandomNumber().getFromRange(1, Integer.parseInt(logicBook.substring(logicBook.indexOf(',') + 1)));
            System.out.println("   " + logicBooks.get(i) + "." + logicPage);
        }
    }

    private static void printInterviewQuestions() {
        final List<String> questions = new ArrayList<String>();
//        addQs(questions, InterviewQuestions.ACTION_SCRIPT);
//        addQs(questions, InterviewQuestions.AJAX);
        addQs(questions, InterviewQuestions.ANDROID);
//        addQs(questions, InterviewQuestions.ANT);
//        addQs(questions, InterviewQuestions.ARCHITECTURE);
//        addQs(questions, InterviewQuestions.AUTO_IT);
        addQs(questions, InterviewQuestions.BASH);
//        addQs(questions, InterviewQuestions.C);
//        addQs(questions, InterviewQuestions.COLLECTIONS);
//        addQs(questions, InterviewQuestions.CONCURRENCY);
//        addQs(questions, InterviewQuestions.CPLUSPLUS);
        addQs(questions, InterviewQuestions.CQ5);
//        addQs(questions, InterviewQuestions.CRYPTOGRAPHY);
//        addQs(questions, InterviewQuestions.CRYSTAL_REPORT);
//        addQs(questions, InterviewQuestions.CSHARP);
        addQs(questions, InterviewQuestions.CSS);
//        addQs(questions, InterviewQuestions.DB);
//        addQs(questions, InterviewQuestions.DEBUGGING);
//        addQs(questions, InterviewQuestions.DELPHI_ACTIVEX);
//        addQs(questions, InterviewQuestions.DELPHI_API);
//        addQs(questions, InterviewQuestions.DELPHI_COM);
//        addQs(questions, InterviewQuestions.DELPHI_COM_PLUS);
//        addQs(questions, InterviewQuestions.DELPHI_DCOM);
//        addQs(questions, InterviewQuestions.DELPHI_OLE);
//        addQs(questions, InterviewQuestions.DELPHI_TCP);
//        addQs(questions, InterviewQuestions.DELPHI_UDP);
//        addQs(questions, InterviewQuestions.EJB);
//        addQs(questions, InterviewQuestions.ESTIMATION);
//        addQs(questions, InterviewQuestions.EXT_JS);
        addQs(questions, InterviewQuestions.FELIX);
//        addQs(questions, InterviewQuestions.FIREBIRD);
        addQs(questions, InterviewQuestions.GRAILS);
        addQs(questions, InterviewQuestions.GROOVY);
        addQs(questions, InterviewQuestions.HIBERNATE);
        addQs(questions, InterviewQuestions.HTML);
//        addQs(questions, InterviewQuestions.INFORMIX);
//        addQs(questions, InterviewQuestions.IOS);
        addQs(questions, InterviewQuestions.JAVA);
//        addQs(questions, InterviewQuestions.JAVA_EE);
        addQs(questions, InterviewQuestions.JAVASCRIPT);
//        addQs(questions, InterviewQuestions.JAVA_SE);
//        addQs(questions, InterviewQuestions.JBOSS);
//        addQs(questions, InterviewQuestions.JDBC);
//        addQs(questions, InterviewQuestions.JMS);
        addQs(questions, InterviewQuestions.JQUERY);
//        addQs(questions, InterviewQuestions.JSON);
        addQs(questions, InterviewQuestions.JSP);
        addQs(questions, InterviewQuestions.JSTL);
//        addQs(questions, InterviewQuestions.JUNIT);
//        addQs(questions, InterviewQuestions.LINUX);
        addQs(questions, InterviewQuestions.MAVEN);
        addQs(questions, InterviewQuestions.MOBILE_DEVELOPMENT);
        addQs(questions, InterviewQuestions.MONGO_DB);
//        addQs(questions, InterviewQuestions.MS_SQL_SERVER);
//        addQs(questions, InterviewQuestions.MULTITHREADING);
//        addQs(questions, InterviewQuestions.MYSQL);
//        addQs(questions, InterviewQuestions.OOP);
//        addQs(questions, InterviewQuestions.ORACLE);
//        addQs(questions, InterviewQuestions.PASCAL);
//        addQs(questions, InterviewQuestions.PATTERNS);
//        addQs(questions, InterviewQuestions.PERL);
//        addQs(questions, InterviewQuestions.PHP);
//        addQs(questions, InterviewQuestions.PL_SQL);
//        addQs(questions, InterviewQuestions.POSTGRESQL);
//        addQs(questions, InterviewQuestions.PROPOSALS);
//        addQs(questions, InterviewQuestions.PYTHON);
//        addQs(questions, InterviewQuestions.QT);
//        addQs(questions, InterviewQuestions.RUBY);
//        addQs(questions, InterviewQuestions.SELENIUM);
//        addQs(questions, InterviewQuestions.SERVLETS);
        addQs(questions, InterviewQuestions.SLING);
//        addQs(questions, InterviewQuestions.SOA);
        addQs(questions, InterviewQuestions.SPRING);
//        addQs(questions, InterviewQuestions.SPRING_IOC);
        addQs(questions, InterviewQuestions.SPRING_MVC);
        addQs(questions, InterviewQuestions.SQL);
//        addQs(questions, InterviewQuestions.SWING);
        addQs(questions, InterviewQuestions.TOMCAT);
//        addQs(questions, InterviewQuestions.UML);
//        addQs(questions, InterviewQuestions.UNIX_SHELL_SCRIPTING);
        addQs(questions, InterviewQuestions.WEB_DEVELOPMENT);
//        addQs(questions, InterviewQuestions.WEBLOGIC);
//        addQs(questions, InterviewQuestions.WEB_SERVICES);
//        addQs(questions, InterviewQuestions.WIN_API);
//        addQs(questions, InterviewQuestions.WIN_FORMS);
//        addQs(questions, InterviewQuestions.WSDL);
//        addQs(questions, InterviewQuestions.XHTML);
        addQs(questions, InterviewQuestions.XML);
//      interview relax
//      1) Remember: It's a two-way street.
//      2) ?
//        3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679
        System.out.println("Remember: It's a two-way street. This is a conversation, not an interrogation. \"Don't forget that you're not the only one being interviewed -- you're also interviewing the organization,\" Blanck said. Remembering that this is a back and forth discussion, where you can -- and should -- ask questions as well as answer them, can help you feel more comfortable.");
        for (String s : questions) {
            System.out.println(s);
        }
    }

    private static void addQs(List<String> questions, StringTypeInterface stringType) {
        final int count = 2;
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(stringType, count));
    }

}
