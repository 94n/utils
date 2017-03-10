package my.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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
        /*final List<String> filePaths = new ArrayList<String>();
        filePaths.add("F:\\Java\\TestProject\\2010.txt");
        filePaths.add("F:\\Java\\TestProject\\2011.txt");
        filePaths.add("F:\\Java\\TestProject\\2013.txt");
        getUniqueLines(filePaths);*/
        q();
    }

    private static void q() {
        try {
            final BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\temp\\4.txt"));
            List<String> updated = new ArrayList<>();
            String line;
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] values = new String[11];
                    values[0] = line.substring(ordinalIndexOf(line, ",", 10) + 1, ordinalIndexOf(line, ",", 12));
                    values[1] = line.substring(ordinalIndexOf(line, ",", 12) + 1, ordinalIndexOf(line, ",", 14));
                    values[2] = line.substring(ordinalIndexOf(line, ",", 14) + 1, ordinalIndexOf(line, ",", 16));
                    values[3] = line.substring(ordinalIndexOf(line, ",", 16) + 1, ordinalIndexOf(line, ",", 17));
                    values[4] = line.substring(ordinalIndexOf(line, ",", 17) + 1, ordinalIndexOf(line, ",", 19));
                    values[5] = line.substring(ordinalIndexOf(line, ",", 19) + 1, ordinalIndexOf(line, ",", 20));
                    values[6] = line.substring(ordinalIndexOf(line, ",", 20) + 1, ordinalIndexOf(line, ",", 21));
                    values[7] = line.substring(ordinalIndexOf(line, ",", 21) + 1, ordinalIndexOf(line, ",", 22));
                    values[8] = line.substring(ordinalIndexOf(line, ",", 22) + 1, ordinalIndexOf(line, ",", 23));
                    values[9] = line.substring(ordinalIndexOf(line, ",", 23) + 1, ordinalIndexOf(line, ";", 1) - 1);
                    /*if (line.substring(ordinalIndexOf(line, ",", 23) + 1, ordinalIndexOf(line, ",", 24)).equals("null")) {
                        values[8] = line.substring(ordinalIndexOf(line, ",", 23) + 1, ordinalIndexOf(line, ",", 24));
                        values[9] = line.substring(ordinalIndexOf(line, ",", 24) + 1, ordinalIndexOf(line, ",", 25));
                        values[10] = line.substring(ordinalIndexOf(line, ",", 25) + 1, ordinalIndexOf(line, ",", 27));
                        values[11] = line.substring(ordinalIndexOf(line, ",", 27) + 1, ordinalIndexOf(line, ";", 1) - 1);
                    } else {
                        values[8] = line.substring(ordinalIndexOf(line, ",", 23) + 1, ordinalIndexOf(line, ",", 25));
                        values[9] = line.substring(ordinalIndexOf(line, ",", 25) + 1, ordinalIndexOf(line, ",", 26));
                        values[10] = line.substring(ordinalIndexOf(line, ",", 26) + 1, ordinalIndexOf(line, ",", 28));
                        values[11] = line.substring(ordinalIndexOf(line, ",", 28) + 1, ordinalIndexOf(line, ";", 1) - 1);
                    }*/
                    values[10] = line.substring(ordinalIndexOf(line, "id= ", 1) + 4, ordinalIndexOf(line, ",", 10));
                    System.out.println("update CRITICALITY_CRITERIA_VALUE set END_DATE=" + values[0] + ",UPDATE_TIMESTAMP=" + values[1] + ",CREATE_TIMESTAMP=" + values[2] + ",ASSET_ID=" + values[3] + ",START_DATE=" + values[4] + ",SAFETY=" + values[5] + ",NETWORK_PERFORMANCE=" + values[6] + ",ENVIRONMENTAL=" + values[7] + ",FINANCIAL=" + values[8] + ",ACI=" + values[9] + " where id=" + values[10] + ";");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //'95.05',to_date('06-MAR-2017','DD-MON-YYYY'),to_date('12-FEB-2017','DD-MON-YYYY'),null,59160,95,100,null,to_date('06-MAR-2017','DD-MON-YYYY'),7172,to_date('12-FEB-2017','DD-MON-YYYY'));
    private static int ordinalIndexOf(String str, String substr, int n) {
        int pos = str.indexOf(substr);
        while (--n > 0 && pos != -1)
            pos = str.indexOf(substr, pos + 1);
        return pos;
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
