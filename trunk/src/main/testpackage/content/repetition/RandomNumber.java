package testpackage.content.repetition;

/**
 * User: mtitov
 * Date: 7/15/11
 * Time: 1:00 PM
 */
public class RandomNumber {

    private int number;

    private long longNumber;

    public int getFromRange(int min, int max) {
        generateFromRange(min, max);
        return number;
    }

    public int[] getFromRange(int numberOfNumbers, int min, int max) {
        final int[] numbers = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            numbers[i] = getFromRange(min, max);
        }
        return numbers;
    }

    public long getFromRange(long min, long max) {
        generateFromRange(min, max);
        return longNumber;
    }

    private void generateFromRange(int min, int max) {
        number = min + (int) (Math.random() * ((max - min) + 1));
    }

    private void generateFromRange(long min, long max) {
        longNumber = min + (long) (Math.random() * ((max - min) + 1));
    }

}
