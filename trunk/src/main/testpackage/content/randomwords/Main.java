package testpackage.content.randomwords;

import java.io.IOException;

/**
 * User: mtitov
 * Date: 11/12/12
 * Time: 7:03 PM
 */
public class Main {

    public static void main(String[] args) throws IOException {
        new WordService().addBookByWords("D:\\Text\\Txt\\Notes.txt");
    }

}
