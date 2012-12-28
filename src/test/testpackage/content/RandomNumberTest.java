package testpackage.content;

//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
import testpackage.content.repetition.RandomNumber;

/**
 * User: mtitov
 * Date: 7/18/11
 * Time: 3:06 PM
 */
public class RandomNumberTest {

    private RandomNumber randomNumber;

//    @BeforeSuite
    public void setUp() {
        randomNumber = new RandomNumber();
    }

//    @Test
    public void testGetFromRange1() {
        final int randomInt = randomNumber.getFromRange(3, 0);
        assert randomInt >= 0 && randomInt <= 3;
    }

//    @Test
    public void testGetFromRange() {
        final int randomInt = randomNumber.getFromRange(0, 3);
        assert randomInt >= 0 && randomInt <= 3;
    }

}
