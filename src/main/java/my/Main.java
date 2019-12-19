package my;

import my.core.filereader.FileReader;

import java.time.LocalDate;

/**
 * Created by m on 02.08.2016 23:41.
 */
public class Main {

    private static void getTrainTicketBuyDay(LocalDate tripDay) {
        StuffGenerator.addDays(tripDay, -44);
        System.out.print("at 9:00");
    }

    public static void main(String[] args) {
        //printInclusiveDateDifferenceInDays(LocalDate.now(), LocalDate.of(2016, Month.NOVEMBER, 29));
        //printDateSince(LocalDate.of(2010, Month.DECEMBER, 16), 999);
        //StuffGenerator.generateName(8, 1);
        //StuffGenerator.generatePassword(10, 4);
        //StuffGenerator.print2WeekVacationStartDates();
        //StuffGenerator.printPiTimePoints();
        StuffGenerator.printZeroBasedPiDigitIndex();
        printGameList();
        //StuffGenerator.generateNumber(1, 4);
        //StuffGenerator.printSportTimeCountingSecondPerDaySinceThirty();
        //getTrainTicketBuyDay(LocalDate.of(2017, Month.JANUARY, 8));
    }

    private static void printGameList() {
        FileReader.main(null);
    }

}
