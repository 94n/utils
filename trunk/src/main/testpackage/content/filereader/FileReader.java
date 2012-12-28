package testpackage.content.filereader;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * User: mtitov
 * Date: 4/10/12
 * Time: 2:09 PM
 */
public class FileReader {

    private static boolean show = true;

    public static void main(String args[]) {
//        System.out.println(getNumberOfIterations(getPiDigits(), 4));
        System.out.println(getDifferenceInIterationsOfNeighbourItems(8));
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
