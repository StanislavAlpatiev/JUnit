import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QTest {
    private static Q queue;

    @BeforeAll
    static void setUpBeforeAll() {
        queue = new Q();
    }


    @BeforeEach
    void setUp() {
        queue.addToQueue(new Data(12, 3));
        queue.addToQueue(3,new Data(11, 3));
        queue.addToQueue(8,new Data(9, 3));
        queue.addToQueue(9,new Data(10, 3));
        queue.addToQueue(2,new Data(8, 3));
        queue.addToQueue(1,new Data(3, 3));
        queue.addToQueue(7,new Data(5, 3));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToQueueTest() {
        queue.addToQueue(new Data(1, 3));
    }

    @Test
    void testAddToQueueTest() {
        queue.addToQueue(new Data(12, 3));
    }

    @Test
    void removeFromQueueTest() {
        queue.removeFromQueue();
    }

    @Test
    void peakQueueTest() {
        queue.peakQueue();
    }

    @Test
    void pollQueueTest() {
        queue.pollQueue();
    }
}