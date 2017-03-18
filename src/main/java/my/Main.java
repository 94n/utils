package my;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * Created by m on 02.08.2016 23:41.
 */
public class Main {

    public static void main(String[] args) {
        //printInclusiveDateDifferenceInDays(LocalDate.now(), LocalDate.of(2016, Month.NOVEMBER, 29));
        //printDateSince(LocalDate.of(2010, Month.DECEMBER, 16), 999);
        //StuffGenerator.generateName(8, 1);
        //StuffGenerator.generatePassword(8, 3);
        //StuffGenerator.print2WeekVacationStartDates();
        //printPiTimePoints();
        StuffGenerator.printZeroBasedPiDigitIndex();
        //StuffGenerator.generateNumber(0, 50000000);
        //StuffGenerator.printSportTimeCountingSecondPerDaySinceThirty();
        //getTrainTicketBuyDay(LocalDate.of(2017, Month.JANUARY, 8));
    }

    private static void getTrainTicketBuyDay(LocalDate tripDay) {
        StuffGenerator.addDays(tripDay, -44);
        System.out.print("at 9:00");
    }

}
