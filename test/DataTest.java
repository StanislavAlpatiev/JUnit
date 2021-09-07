import org.junit.jupiter.api.*;

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
    void toStringMethodFormatingTest() {
        assertEquals("22 Jun 2000", String.valueOf(d));
    }

}