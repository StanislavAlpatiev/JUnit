import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class AbsTest {

    @BeforeAll
    static void setUp() {
    }

    @AfterAll
    static void tearDown() {
    }

    @BeforeEach
    void setUpBeforeEachTest() {
    }

    @AfterEach
    void tearDownAfterEachTest() {
    }


    @Test
    void isLeapYearTest() {
        Abs abs = new Abs();
        assertTrue(abs.isleapYear(2020));
        //assertTrue(abs.isleapYear(2002));
        assertFalse(abs.isleapYear(2019));
    }
}