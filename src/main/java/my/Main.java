package my;

import my.core.UniqueWordCounter;
import my.core.filelists.FileListGenerator;
import my.core.filereader.FileReader;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by m on 02.08.2016 23:41.
 */
public class Main {


    public static void main(String[] args) {
        StuffGenerator.printDarebeeTimePoints(LocalDateTime.of(2024, Month.OCTOBER, 20, 13, 0), 111);
//        FileListGenerator.generateRandomList("D:\\Sport\\temp");
//        StuffGenerator.printPiTimePoints();
//        StuffGenerator.printZeroBasedPiDigitIndex();


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

    private static void printGameList() {

    }

}
