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
        StringListGenerator.shufflePrintStringsWithUniqueElements(StringType.RECIPES);
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
//        addQ(questions, InterviewQuestions.ACTION_SCRIPT);
//        addQ(questions, InterviewQuestions.AJAX);
//        addQ(questions, InterviewQuestions.ANDROID);
//        addQ(questions, InterviewQuestions.ANT);
//        addQ(questions, InterviewQuestions.ARCHITECTURE);
//        addQ(questions, InterviewQuestions.AUTO_IT);
//        addQ(questions, InterviewQuestions.BASH);
//        addQ(questions, InterviewQuestions.C);
//        addQ(questions, InterviewQuestions.COLLECTIONS);
//        addQ(questions, InterviewQuestions.CONCURRENCY);
        addQ(questions, InterviewQuestions.CPLUSPLUS);
//        addQ(questions, InterviewQuestions.CQ5);
//        addQ(questions, InterviewQuestions.CRYPTOGRAPHY);
//        addQ(questions, InterviewQuestions.CRYSTAL_REPORT);
//        addQ(questions, InterviewQuestions.CSHARP);
        addQ(questions, InterviewQuestions.CSS);
//        addQ(questions, InterviewQuestions.DB);
//        addQ(questions, InterviewQuestions.DEBUGGING);
        addQ(questions, InterviewQuestions.DELPHI);
//        addQ(questions, InterviewQuestions.DELPHI_ACTIVEX);
//        addQ(questions, InterviewQuestions.DELPHI_API);
//        addQ(questions, InterviewQuestions.DELPHI_COM);
//        addQ(questions, InterviewQuestions.DELPHI_COM_PLUS);
//        addQ(questions, InterviewQuestions.DELPHI_DCOM);
//        addQ(questions, InterviewQuestions.DELPHI_OLE);
//        addQ(questions, InterviewQuestions.DELPHI_TCP);
//        addQ(questions, InterviewQuestions.DELPHI_UDP);
//        addQ(questions, InterviewQuestions.ECLIPSE);
//        addQ(questions, InterviewQuestions.EJB);
//        addQ(questions, InterviewQuestions.ESTIMATION);
//        addQ(questions, InterviewQuestions.EXT_JS);
//        addQ(questions, InterviewQuestions.FELIX);
//        addQ(questions, InterviewQuestions.FIREBIRD);
        addQ(questions, InterviewQuestions.GIT);
//        addQ(questions, InterviewQuestions.GRAILS);
//        addQ(questions, InterviewQuestions.GROOVY);
//        addQ(questions, InterviewQuestions.HIBERNATE);
        addQ(questions, InterviewQuestions.HTML);
//        addQ(questions, InterviewQuestions.HTML5);
//        addQ(questions, InterviewQuestions.INFORMIX);
//        addQ(questions, InterviewQuestions.IOS);
        addQ(questions, InterviewQuestions.JAVA);
//        addQ(questions, InterviewQuestions.JAVA_EE);
        addQ(questions, InterviewQuestions.JAVASCRIPT);
//        addQ(questions, InterviewQuestions.JAVA_SE);
//        addQ(questions, InterviewQuestions.JBOSS);
        addQ(questions, InterviewQuestions.JDBC);
//        addQ(questions, InterviewQuestions.JMS);
//        addQ(questions, InterviewQuestions.JQUERY);
//        addQ(questions, InterviewQuestions.JSON);
        addQ(questions, InterviewQuestions.JSP);
//        addQ(questions, InterviewQuestions.JSTL);
        addQ(questions, InterviewQuestions.JUNIT);
//        addQ(questions, InterviewQuestions.LINUX);
        addQ(questions, InterviewQuestions.MAVEN);
//        addQ(questions, InterviewQuestions.MOBILE_DEVELOPMENT);
//        addQ(questions, InterviewQuestions.MONGO_DB);
//        addQ(questions, InterviewQuestions.MS_SQL_SERVER);
//        addQ(questions, InterviewQuestions.MULTITHREADING);
        addQ(questions, InterviewQuestions.MYSQL);
//        addQ(questions, InterviewQuestions.OOP);
//        addQ(questions, InterviewQuestions.ORACLE);
//        addQ(questions, InterviewQuestions.PASCAL);
//        addQ(questions, InterviewQuestions.PATTERNS);
//        addQ(questions, InterviewQuestions.PERL);
//        addQ(questions, InterviewQuestions.PHP);
//        addQ(questions, InterviewQuestions.PL_SQL);
//        addQ(questions, InterviewQuestions.POSTGRESQL);
//        addQ(questions, InterviewQuestions.PROPOSALS);
//        addQ(questions, InterviewQuestions.PYTHON);
//        addQ(questions, InterviewQuestions.QT);
//        addQ(questions, InterviewQuestions.RUBY);
//        addQ(questions, InterviewQuestions.SELENIUM);
        addQ(questions, InterviewQuestions.SERVLETS);
//        addQ(questions, InterviewQuestions.SLING);
//        addQ(questions, InterviewQuestions.SOA);
//        addQ(questions, InterviewQuestions.SPRING);
//        addQ(questions, InterviewQuestions.SPRING_IOC);
//        addQ(questions, InterviewQuestions.SPRING_MVC);
        addQ(questions, InterviewQuestions.SQL);
//        addQ(questions, InterviewQuestions.SWING);
        addQ(questions, InterviewQuestions.TOMCAT);
//        addQ(questions, InterviewQuestions.UML);
//        addQ(questions, InterviewQuestions.UNIX_SHELL_SCRIPTING);
//        addQ(questions, InterviewQuestions.WEB_DEVELOPMENT);
//        addQ(questions, InterviewQuestions.WEBLOGIC);
//        addQ(questions, InterviewQuestions.WEB_SERVICES);
//        addQ(questions, InterviewQuestions.WIN_API);
//        addQ(questions, InterviewQuestions.WINDOWS);
//        addQ(questions, InterviewQuestions.WIN_FORMS);
//        addQ(questions, InterviewQuestions.WSDL);
//        addQ(questions, InterviewQuestions.XHTML);
        addQ(questions, InterviewQuestions.XML);
        for (String s : questions) {
            System.out.println(s);
        }
    }

    private static void addQ(List<String> questions, StringTypeInterface stringType) {
        final int count = 2;
        questions.addAll(StringListGenerator.getRandomStringListWithUniqueElementsAndTypeName(stringType, count));
    }

}
