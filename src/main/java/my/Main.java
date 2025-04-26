package my;

import my.core.UniqueWordCounter;
import my.core.filelists.FileListGenerator;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by m on 02.08.2016 23:41.
 */
public class Main {


    public static void main(String[] args) throws IOException {
//        printSortedNamesForGameNick();
        findViews();

//        printUniqueRowsInAlphabeticalOrder("D:\\skyrim.txt");
//        FileListGenerator.generateRandomList("D:\\Sport\\Darebee");
//        StuffGenerator.printDarebeeTimePoints(LocalDateTime.of(2024, Month.OCTOBER, 30, 12, 0), 2414);
//        StuffGenerator.printZeroBasedPiDigitIndex();
//        StuffGenerator.printPiTimePoints();
//        UniqueWordCounter.countUniqueWords("D:\\doustats.txt");

//        FileListGenerator.generateAlphaList("D:\\Sport\\Darebee");

        //printInclusiveDateDifferenceInDays(LocalDate.now(), LocalDate.of(2016, Month.NOVEMBER, 29));
        //printDateSince(LocalDate.of(2010, Month.DECEMBER, 16), 999);
        //StuffGenerator.generateName(8, 1);
        //StuffGenerator.generatePassword(10, 4);
        //printGameList();
        //StuffGenerator.generateNumber(1, 4);
        //StuffGenerator.printSportTimeCountingSecondPerDaySinceThirty();
        //getTrainTicketBuyDay(LocalDate.of(2017, Month.JANUARY, 8));
    }

    private static void printUniqueRowsInAlphabeticalOrder(String filePath) {
        Set<String> uniqueRows = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                uniqueRows.add(line.trim());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        for (String row : uniqueRows) {
            System.out.println(row);
        }
    }

    private static void findViews() throws IOException {
        String filePath = "D:\\yt.txt";
        File inputFile = new File(filePath);
        Document doc = Jsoup.parse(inputFile, "UTF-8");

        Map<Long, List<String>> resultMap = new HashMap<>();

        Elements divs = doc.select("div#meta");
        for (Element div : divs) {
            Element videoTitle = div.selectFirst("yt-formatted-string#video-title");
            Element metadataSpan = div.selectFirst("span.inline-metadata-item");
            Element additionalText = div.selectFirst("yt-formatted-string#text"); // <- grab text element

            if (videoTitle != null && metadataSpan != null) {
                String rawKey = metadataSpan.text();
                long numberKey = parseViewsOrWatching(rawKey);

                if (numberKey != -1) {
                    String combinedValue = videoTitle.text();

                    if (additionalText != null) {
                        String titleAttr = additionalText.attr("title"); // <- use title attribute!
                        if (!titleAttr.isEmpty()) {
                            combinedValue += " " + titleAttr;
                        }
                    }

                    resultMap.computeIfAbsent(numberKey, k -> new ArrayList<>()).add(combinedValue);
                }
            }
        }

        // Sort the map entries by key descending
        List<Map.Entry<Long, List<String>>> sortedEntries = new ArrayList<>(resultMap.entrySet());
        sortedEntries.sort((e1, e2) -> Long.compare(e2.getKey(), e1.getKey()));

        // Print the sorted result
        for (Map.Entry<Long, List<String>> entry : sortedEntries) {
            for (String combinedValue : entry.getValue()) {
                System.out.println(combinedValue + "    - " + entry.getKey());
            }
        }
        System.out.println("Total: " + divs.size());
    }

    private static long parseViewsOrWatching(String text) {
        text = text.toUpperCase().trim();

        if (text.startsWith("SCHEDULED FOR") || text.startsWith("STREAMED ")) {
            return -1;
        }

        text = text.replace("VIEWS", "").replace("WATCHING", "").trim();
        text = text.replace(",", "");

        if (text.isEmpty()) {
            return -1;
        }

        long multiplier = 1;

        if (text.endsWith("K")) {
            multiplier = 1_000;
            text = text.replace("K", "");
        } else if (text.endsWith("M")) {
            multiplier = 1_000_000;
            text = text.replace("M", "");
        } else if (text.endsWith("B")) {
            multiplier = 1_000_000_000;
            text = text.replace("B", "");
        }

        double number = Double.parseDouble(text);
        return (long) (number * multiplier);
    }

    public static void printSortedNamesForGameNick() {
        String filePath = "D:\\Names.txt";
        TreeSet<String> sortedSet = null;
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Use a TreeSet to automatically handle duplicates and sorting
            sortedSet = new TreeSet<>((a, b) -> {
                if (a.length() != b.length()) {
                    return Integer.compare(a.length(), b.length()); // Sort by length
                }
                return a.compareTo(b); // Sort alphabetically if lengths are equal
            });

            sortedSet.addAll(lines);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
            for (String line : sortedSet) {
                System.out.println(line);
            }

    }

}
