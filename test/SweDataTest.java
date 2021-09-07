import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SweDataTest {
    private static final SweData swe = new SweData(2000, 6, 22);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void constructorSetsAttributes() {
        assertEquals(2000, swe.getYear());
        assertEquals(6, swe.getMonth());
        assertEquals(22, swe.getDay());
    }

    @Test
    void constructorLowerBoundOfDateTest() {
        new SweData(1753, 2, 28);
    }

    @Test
    void constructorLowerBoundOfDateNegativeTest() {
        new SweData(1753, 3, 1);
    }

    @Test
    void testToString() {
        SweData s = new SweData(2000, 10,22);
        assertEquals("2000-10-22", String.valueOf(s));
        assertEquals("2000-06-22", String.valueOf(swe));
    }
}