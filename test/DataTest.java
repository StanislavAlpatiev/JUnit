import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    final static Data TWENTYSECOND_JUN_2000 = new Data(2000, 6, 22);;

    @BeforeAll
    static void setUp() {
    }

    @AfterAll
    static void tearDown() {
    }

    @BeforeEach
    void setupBeforeEachTest() {
    }

    @AfterEach
    void tearDownAfterEachTest() {
    }

    @Test
    void constructorSetsAttributes() {
        assertEquals(2000, TWENTYSECOND_JUN_2000.getYear());
        assertEquals(6, TWENTYSECOND_JUN_2000.getMonth());
        assertEquals(22, TWENTYSECOND_JUN_2000.getDay());
    }

    @Test
    void monthIsJunForMonth6() {
        assertEquals("Jun", TWENTYSECOND_JUN_2000.getMonthName());
    }

    @Test
    void constructorOverloadingWithoutYearParameterTest() {
        Data data = new Data( 10,15);
    }

    @Test
    void constructorOverloadingWithoutParametersTest() {
        Data data = new Data();
    }

    @Test
    void constructorLowerBoundPassingTest() {
        Data data = new Data(1582, 10,15);
    }

    @Test
    void constructorLowerBoundYearTest() {
        Data data = new Data(1581, 10,15);
    }

    @Test
    void constructorLowerBoundMonthTest() {
        Data data = new Data(1582, 9,15);
    }

    @Test
    void constructorLowerBoundDayTest() {
        Data data = new Data(1582, 10,14);
    }

//    @Test
//    void equalsTest() {
//        Data data = new Data(1999, 10,14);
//        Data data2 = new Data(1999, 10,14);
//        boolean b = data.equals(data2);
//        assertTrue(b);
//    }

//    @Test
//    void compareToTest() {
//        Data data = new Data(1999, 11,14);
//        Data data2 = new Data(1999, 10,14);
//        int i = data.compareTo(data2);
//        assertEquals(0, i);
//    }

    @ParameterizedTest
    @CsvSource({"1, January", "2, February", "3, March", "4, April", "5, May", "6, Jun",
            "7, July", "8, August", "9, September", "10, October", "11, November", "12, December"})
    void getMonthNameGivesCorrectNameTest(int month, String name) {
        Data data = new Data(2020, month, 1);
        assertEquals(name, data.getMonthName());
    }

    @Test
    void toStringMethodFormatingTest() {
        assertEquals("22 Jun 2000", String.valueOf(TWENTYSECOND_JUN_2000));
    }

}