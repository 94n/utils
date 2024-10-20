package my;

import my.core.TimeUtils;
import my.core.repetition.RandomNumber;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * User: mtitov
 * Date: 4/4/12
 * Time: 1:37 PM
 */
public interface StuffGenerator {

    Consumer<Object> p = System.out::println;

    static void addDays(LocalDate start, int days) {
        p.accept(start.plusDays(days));
    }

    static void generateName(int length, int type) {
        p.accept(my.core.repetition.StringGenerator.generateString(length, type));
    }

    static void generateNumber(int min, int max) {
        p.accept(new RandomNumber().getFromRange(min, max));
    }

    //8 Interface improvements
    //Interfaces can now define static methods.
    static void generatePassword(int length, int type) {
        p.accept(my.core.repetition.StringGenerator.generateString(length, type));
    }

    static void generatePassword(int length, int type, boolean includeAllSymbolTypes) {
        p.accept(my.core.repetition.StringGenerator.generateString(length, type, includeAllSymbolTypes));
    }

    //TODO refactor to java 8 dates before using
    static void print2WeekVacationStartDates() {
        LocalDate vacationStartDate = LocalDate.of(2016, Month.AUGUST, 11);
        int numberOfVacationsToCalculate = 8;
        double desiredVacationDays = 14;
        double vacationDaysPerYear = 28;
        int workDaysTillVacation = new Long(Math.round(desiredVacationDays / vacationDaysPerYear * 365.25)).intValue();
        for (int i = 0; i < numberOfVacationsToCalculate; i++) {
            vacationStartDate = vacationStartDate.plusDays(workDaysTillVacation);
            p.accept(vacationStartDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        }
    }

    static void printDateSince(LocalDate start, int daysToAdd) {
        p.accept(start.plusDays(daysToAdd));
    }

    static void printPiTimePoints() {
        readPi();
        return;
//        String seed =
//                "314159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436789259036001133053054882046652138414695194151160943305727036575959195309218611738193261179310511854807446237996274956735188575272489122793818301194912983367336244065664308602139494639522473719070217986094370277053921717629317675238467481846766940513200056812714526356082778577134275778960917363717872146844090122495343014654958537105079227968925892354201995611212902196086403441815981362977477130996051870721134999999837297804995105973173281609631859502445945534690830264252230825334468503526193118817101000313783875288658753320838142061717766914730359825349042875546873115956286388235378759375195778185778053217122680661300192787661119590921642019893809525720106548586327886593615338182796823030195203530185296899577362259941389124972177528347913151557485724245415069595082953311686172785588907509838175463746493931925506040092770167113900984882401285836160356370766010471018194295559619894676783744944825537977472684710404753464620804668425906949129331367702898915210475216205696602405803815019351125338243003558764024749647326391419927260426992279678235478163600934172164121992458631503028618297455570674983850549458858692699569092721079750930295532116534498720275596023648066549911988183479775356636980742654252786255181841757467289097777279380008164706001614524919217321721477235014144197356854816136115735255213347574184946843852332390739414333454776241686251898356948556209921922218427255025425688767179049460165346680498862723279178608578438382796797668145410095388378636095068006422512520511739298489608412848862694560424196528502221066118630674427862203919494504712371378696095636437191728746776465757396241389086583264599581339047802759009946576407895126946839835259570982582262052248940772671947826848260147699090264013639443745530506820349625245174939965143142980919065925093722169646151570985838741059788595977297549893016175392846813826868386894277415599185592524595395943104997252468084598727364469584865383673622262609912460805124388439045124413654976278079771569143599770012961608944169486855584840635342207222582848864815845602850601684273945226746767889525213852254995466672782398645659611635488623057745649803559363456817432411251507606947945109659609402522887971089314566913686722874894056010150330861792868092087476091782493858900971490967598526136554978189312978482168299894872265880485756401427047755513237964145152374623436454285844479526586782105114135473573952311342716610213596953623144295248493718711014576540359027993440374200731057853906219838744780847848968332144571386875194350643021845319104848100537061468067491927819119793995206141966342875444064374512371819217999839101591956181467514269123974894090718649423196156794520809514655022523160388193014209376213785595663893778708303906979207734672218256259966150142150306803844773454920260541466592520149744285073251866600213243408819071048633173464965145390579626856100550810665879699816357473638405257145910289706414011097120628043903975951567715770042033786993600723055876317635942187312514712053292819182618612586732157919841484882916447060957527069572209175671167229109816909152801735067127485832228718352093539657251210835791513698820914442100675103346711031412671113699086585163983150197016515116851714376576183515565088490998985998238734552833163550764791853589322618548963213293308985706420467525907091548141654985946163718027098199430992448895757128289059232332609729971208443357326548938239119325974636673058360414281388303203824903758985243744170291327656180937734440307074692112019130203303801976211011004492932151608424448596376698389522868478312355265821314495768572624334418930396864262434107732269780280731891544110104468232527162010526522721116603966655730925471105578537634668206531098965269186205647693125705863566201855810072936065";
//        List<LocalDateTime> timePoints = TimeUtils.getTimePoints(seed, LocalDate.of(2024, Month.APRIL, 12));
//        Map<String, Integer> daylightTimesPerDay = new TreeMap<>();
//        Map<String, Integer> timesPerDay = new TreeMap<>();
//        for (LocalDateTime timePoint : timePoints) {
//            String day = timePoint.format(DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//            if (timePoint.toLocalTime().isAfter(LocalTime.of(10, 0)) && timePoint.toLocalTime().isBefore(LocalTime.of(23, 59))) {
//                daylightTimesPerDay.merge(day, 1, (a, b) -> a + b);
//            }
//            timesPerDay.merge(day, 1, (a, b) -> a + b);
//            p.accept(timePoint.format(DateTimeFormatter.ofPattern("d MMMM yyyy H:m")));
//        }
//        p.accept("Average times per day=" + timesPerDay.values().stream().collect(Collectors.averagingInt(i -> i)));
//        p.accept("Daylight average times per day=" + daylightTimesPerDay.values().stream().collect(Collectors.averagingInt(i -> i)));
    }

    private static List<Integer> readPi() {
        String fileName = "D:\\pi.txt";
        List<Integer> digitList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int ch;
            // Read each character from the file
            while ((ch = br.read()) != -1) {
                // Check if the character is a digit
                if (Character.isDigit(ch)) {
                    // Convert the character to an integer and add it to the list
                    digitList.add(Character.getNumericValue(ch));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the list of digits
        System.out.println("Digits read from file: " + digitList.size());
        System.out.println(digitList.stream().limit(128).map(Object::toString).collect(Collectors.joining()) + "...");
        return digitList;
    }

    static void printSportTimeCountingSecondPerDaySinceThirty() {
        p.accept("Sport time: " + TimeUtils.getSportTimeCountingSecondPerDaySinceThirty().toString());
    }

    static void printZeroBasedPiDigitIndex() {
        p.accept("Pi digit index: " + TimeUtils.getDaysSinceForty() + "\nSelect this number of digits, first not selected one is today index");
    }

    //8 Interface improvements
    //Additionally, more importantly, interfaces can now define default methods.
    //for (12.4.2014, 13.4.2014) it prints 2
    default void printInclusiveDateDifferenceInDays(LocalDate start, LocalDate end) {
        p.accept(ChronoUnit.DAYS.between(start, end) + 1);
    }

    static void printDarebeeTimePoints(LocalDateTime startTime, int number) {
        List<LocalDateTime> timePoints = TimeUtils.get10To21HourlyTimePoints(startTime, number);
        for (LocalDateTime timePoint : timePoints) {
            p.accept(timePoint.format(DateTimeFormatter.ofPattern("d MMMM yyyy H:mm")));
        }
    }

}
