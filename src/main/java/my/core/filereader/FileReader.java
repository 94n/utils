package my.core.filereader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * User: mtitov
 * Date: 4/10/12
 * Time: 2:09 PM
 */
public class FileReader {

    private static boolean show = true;

    public static void main(String args[]) {
        //buildTechMap();
        printRandomizedFrequencyList();
    }

    private static void printRandomizedFrequencyList() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        //populateTechMap(frequencyMap);
        populateGameMap(frequencyMap);
        List<String> frequencyList = new ArrayList<>();
        for (String key : frequencyMap.keySet()) {
            for (int i = 0; i < frequencyMap.get(key); i++) {
                frequencyList.add(key);
            }
        }
        Collections.shuffle(frequencyList);
        frequencyList.forEach(System.out::println);
    }

    private static void populateGameMap(Map<String, Integer> frequencyMap) {
        String fileName = "D:\\docs\\gf.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(s -> {
                String[] gameFrequency = s.split("\t");
                frequencyMap.put(gameFrequency[0], Integer.parseInt(gameFrequency[1]));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void populateTechMap(Map<String, Integer> frequencyMap) {
        frequencyMap.put("java", 220);
        frequencyMap.put("git", 77);
        frequencyMap.put("spring", 76);
        frequencyMap.put("sql", 73);
        frequencyMap.put("maven", 66);
        frequencyMap.put("hibernate", 60);
        frequencyMap.put("docker", 45);
        frequencyMap.put("javascript", 44);
        frequencyMap.put("jenkins", 44);
        frequencyMap.put("design patterns", 44);
        frequencyMap.put("spring boot", 42);
        frequencyMap.put("rest", 41);
        frequencyMap.put("oop", 41);
        frequencyMap.put("linux", 40);
    }

    private static void buildTechMap() {
        String fileName = "C:\\utils\\tech.txt";
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            Map<String, Long> techCounts = stream.collect(Collectors.groupingBy(s -> s.trim().toLowerCase(),
                    Collectors.counting()));
            Map<String, Long> sortedTechCounts = techCounts.entrySet()
                    .stream()
                    .sorted((Map.Entry.<String, Long>comparingByValue().reversed()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            sortedTechCounts.forEach((k, v) -> System.out.println(k + " " + v));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int getDifferenceInIterationsOfNeighbourItems(int nextItemNumber) {
        final char[] piDigits = getPiDigits();
        return getNumberOfIterations(piDigits, nextItemNumber) - getNumberOfIterations(piDigits, nextItemNumber - 1);
    }

    private static char[] getPiDigits() {
        final char[] piFileCharacters = new char[128];
        final char[] piDigits = new char[piFileCharacters.length];
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Text\\Txt\\pi.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));
            bufferedReader.read(piFileCharacters);
            int i = 0;
            for (char piChar : piFileCharacters) {
                if (piChar >= '0' && piChar <= '9') {
                    piDigits[i] = piChar;
                    i++;
                }
            }
            dataInputStream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return piDigits;
    }

    private static int getNumberOfIterations(char[] piDigits, int targetNumberOfItems) {
//        if (targetNumberOfItems >= 10) {
//            throw new IllegalArgumentException();
//        }
        final int[] items = new int[targetNumberOfItems];
        int numberOfMarkedItems = 0;
        int numberOfIterations = 0;
        int currentNumberOfItems = 1;
        for (int i = 0; i < piDigits.length; i++) {
            numberOfIterations++;
            final int numberLength;
            if (currentNumberOfItems == 10) {
                numberLength = 1;
            } else {
                numberLength = Integer.toString(currentNumberOfItems).length();
            }
            final StringBuilder currentPiNumberStringBuilder = new StringBuilder();
            int k = i;
            for (int j = 0; j < numberLength; j++) {
                currentPiNumberStringBuilder.append(piDigits[k]);
                k++;
            }
            final int currentPiNumber = Integer.parseInt(currentPiNumberStringBuilder.toString());

            final int currentItem = getCurrentItem(currentPiNumber, currentNumberOfItems) - 1;
            if (items[currentItem] != 1) {
                items[currentItem] = 1;
                numberOfMarkedItems++;
                if (numberOfMarkedItems == targetNumberOfItems) {
                    return numberOfIterations;
                }
                if (numberOfMarkedItems == currentNumberOfItems) {
                    currentNumberOfItems++;
                    Arrays.fill(items, 0);
                    numberOfMarkedItems = 0;
                }
            }
        }
        return -1;
    }

    private static int getCurrentItem(int currentPiNumber, int currentNumberOfItems) {
        int localCurrentPiDigit;
        if (currentPiNumber == 0) {
            localCurrentPiDigit = 10;
        } else {
            localCurrentPiDigit = currentPiNumber;
        }
        if (localCurrentPiDigit > currentNumberOfItems) {
            localCurrentPiDigit -= currentNumberOfItems;
            return getCurrentItem(localCurrentPiDigit, currentNumberOfItems);
        } else {
            return localCurrentPiDigit;
        }
    }

}
