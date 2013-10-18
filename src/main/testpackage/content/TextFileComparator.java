package testpackage.content;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
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
        final Map<String, Integer> chartsCount = new HashMap<String, Integer>();//how many charts contain a track
        final Map<String, Integer> totalChartRating = new TreeMap<String, Integer>(new IgnoreCaseStringComparator<String>());
        final ValueComparator bvc = new ValueComparator(totalChartRating);
        final TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);
        for (String filePath : filePaths) {
            int chartNumber = 0;
            try {
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    chartNumber++;
                    updateTotalChartMaps(chartsCount, totalChartRating, chartNumber, line);
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
//        printTotalRating(totalChartRating, sorted_map, chartsCount, filePaths);
        return uniqueLines;
    }

    private static void updateTotalChartMaps(Map<String, Integer> chartsCount, Map<String, Integer> totalChartRating, int chartNumber, String line) {
        if (totalChartRating.containsKey(line)) {
            totalChartRating.put(line, totalChartRating.get(line) + chartNumber);
        } else {
            totalChartRating.put(line, chartNumber);
        }
        if (chartsCount.containsKey(line)) {
            chartsCount.put(line, chartsCount.get(line) + 1);
        } else {
            chartsCount.put(line, 1);
        }
    }

    private static void printTotalRating(Map<String, Integer> totalChartRating, TreeMap<String, Integer> sorted_map, Map<String, Integer> chartsCount, List<String> filePaths) {
        addChartAbsenceWeights(totalChartRating, chartsCount, filePaths);
        sorted_map.putAll(totalChartRating);
        for (Map.Entry entry : sorted_map.entrySet()) {
            System.out.println(entry.getValue() + ". " + entry.getKey());
        }
    }

    private static void addChartAbsenceWeights(Map<String, Integer> totalChartRating, Map<String, Integer> chartsCount, List<String> filePaths) {
        for (Map.Entry<String, Integer> totalChartEntry : totalChartRating.entrySet()) {
            final int chartAbsenceWeight = (filePaths.size() - chartsCount.get(totalChartEntry.getKey())) * 1001;//song gets additional 1001 for each chart where it wasn't present
            totalChartEntry.setValue(totalChartEntry.getValue() + chartAbsenceWeight);
        }
    }

    static class ValueComparator implements Comparator<String> {

        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with equals.
        public int compare(String a, String b) {
            if (base.get(a) < base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

}
