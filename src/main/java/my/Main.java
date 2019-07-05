package my;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

/**
 * Created by m on 02.08.2016 23:41.
 */
public class Main {

    public static void main(String[] args) {
        //printInclusiveDateDifferenceInDays(LocalDate.now(), LocalDate.of(2016, Month.NOVEMBER, 29));
        //printDateSince(LocalDate.of(2010, Month.DECEMBER, 16), 999);
        //StuffGenerator.generateName(8, 1);
        //StuffGenerator.generatePassword(10, 4);
        //StuffGenerator.print2WeekVacationStartDates();
        //printPiTimePoints();
        StuffGenerator.printZeroBasedPiDigitIndex();
        //StuffGenerator.generateNumber(1, 4);
        //StuffGenerator.printSportTimeCountingSecondPerDaySinceThirty();
        //getTrainTicketBuyDay(LocalDate.of(2017, Month.JANUARY, 8));
    }

    private static void getTrainTicketBuyDay(LocalDate tripDay) {
        StuffGenerator.addDays(tripDay, -44);
        System.out.print("at 9:00");
    }

}
