package testpackage.content.randomwords;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Words service
 * <p/>
 * User: mtitov
 * Date: 11/12/12
 * Time: 6:52 PM
 */
public class WordService {

    @Autowired
    private WordsDao wordsDao;

    /**
     * Add book by words to database
     *
     * @param path path to book file in txt format.
     * @throws java.io.FileNotFoundException if file is not found
     */
    public void addBookByWords(String path) throws IOException {
//        if (true) {
//            throw new IllegalStateException("Launch carefully");
//        }
        final File file = new File(path);
        final List<String> words = new ArrayList<String>();
        final Scanner scanner = new Scanner(new InputStreamReader(new FileInputStream(file), "cp1251"));
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        for (String s : words) {
            wordsDao.add(new Word(s));
        }
    }

}
