package testpackage.content;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * User: makstitoff
 * Date: 31.05.13
 * Time: 10:01
 * To change this template use File | Settings | File Templates.
 */
public class TextFileComparator {

    public static void main(String[] args) {
        final List<String> filePaths = new ArrayList<String>();
        filePaths.add("F:\\Java\\TestProject\\2010.txt");
        filePaths.add("F:\\Java\\TestProject\\2011.txt");
        filePaths.add("F:\\Java\\TestProject\\2013.txt");
        getUniqueLines(filePaths);
    }

    public static Set<String> getUniqueLines(List<String> filePaths) {
        final Set<String> uniqueLines = new TreeSet<String>(new IgnoreCaseStringComparator<String>());
        int trackNumber = 0;
        for (String filePath : filePaths) {
            int chartNumber = 0;
            try {
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    chartNumber++;
                    if (uniqueLines.add(line)) {
                        trackNumber++;
                        final int trackNumber1714 = trackNumber + 1714;
                        final int trackNumber3428 = trackNumber + 3428;
                        final int trackNumber5142 = trackNumber + 5142;
                        final int trackNumber6856 = trackNumber + 6856;
                        final int trackNumber8570;
                        final int trackNumber9563;
                        System.out.print("(" + trackNumber + "," + trackNumber1714 + "," + trackNumber3428 + "," + trackNumber5142 + "," + trackNumber6856);
                        if (trackNumber < 1430) {
                            trackNumber8570 = trackNumber + 8570;
                            System.out.print("," + trackNumber8570);
                        }
                        if (trackNumber < 438) {
                            trackNumber9563 = trackNumber + 9563;
                            System.out.print("," + trackNumber9563);
                        }
                        System.out.print(") " + chartNumber + ". " + line + "\n");
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return uniqueLines;
    }

}
