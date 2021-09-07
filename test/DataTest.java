import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    Data d;

    public DataTest() {
        d = new Data(2000, 6, 22);
        //System.out.println(String.valueOf(d));
    }

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
    void getYearReturnTest() {
        assertEquals(2000, d.getYear());
    }

    @Test
    void getMonthReturnTest() {
        assertEquals(6, d.getMonth());
    }

    @Test
    void getDayReturnTest() {
        assertEquals(22, d.getDay());
    }

    @ParameterizedTest
    @CsvSource({"1, January", "2, February", "3, March", "4, April", "5, May", "6, Jun",
            "7, July", "8, August", "9, September", "10, October", "11, November", "12, December"})
    void getMonthNameGivesCorrectNameTest(int month, String name) {
        Data data = new Data(2020, month, 1);
        assertEquals(name, data.getMonthName());
    }

    @Test
    void toStringMethodFormatingTest() {
        assertEquals("22 Jun 2000", String.valueOf(d));
    }

}