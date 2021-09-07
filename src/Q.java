import java.util.ArrayList;
import java.util.List;

public class Q {

    public class QueueItem implements Comparable<QueueItem> {
        private final int DEFAULT_QUEUE_PRIORITY = 0;
        private final int queuePriority;
        private final Data data;

        QueueItem(int queuePriority, Data data) {
            this.queuePriority = queuePriority;
            this.data = data;
        }

        QueueItem(Data data) {
            this.queuePriority = DEFAULT_QUEUE_PRIORITY;
            this.data = data;
        }

        public int getQueuePriority() {
            return queuePriority;
        }

        @Override
        public int compareTo(QueueItem q) {
            return queuePriority - q.getQueuePriority();
        }
    }

    private static final int DEFAULT_MAX_ELEMENTS = 256;
    private List<QueueItem> queue = new ArrayList<QueueItem>();

    private final int MAX_ELEMENTS;

    public Q() {
        this(DEFAULT_MAX_ELEMENTS);
    }

    public Q(int maxElements) {
        MAX_ELEMENTS = maxElements;
    }

    public void addToQueue(int queuePriority, Data d) {
        if(queue.size() == MAX_ELEMENTS) {
            throw new IllegalStateException("Queue is full!");
        }

        queue.add(new QueueItem(queuePriority, d));
        queue.sort(QueueItem::compareTo);
    }

    public void addToQueue(Data d) {
        if(queue.size() == MAX_ELEMENTS) {
            throw new IllegalStateException("Queue is full!");
        }

        queue.add(new QueueItem(d));
        queue.sort(QueueItem::compareTo);
    }

    public Data removeFromQueue() {
        return queue.remove(0).data;
    }

    public Data peakQueue() {
        return queue.get(0).data;
    }

    public Data pollQueue() {
        Data d = queue.remove(0).data;
        queue.sort(QueueItem::compareTo);
        return d;
    }

    public static void main(String[] args) {
        Q queue2 = new Q();

        queue2.addToQueue(new Data(12, 3));
        queue2.addToQueue(3, new Data(11, 3));
        queue2.addToQueue(8, new Data(9, 3));
        queue2.addToQueue(9, new Data(10, 3));
        queue2.addToQueue(2, new Data(8, 3));
        queue2.addToQueue(1, new Data(3, 3));
        queue2.addToQueue(7, new Data(5, 3));
        queue2.addToQueue(new Data(12, 3));

        System.out.println(queue2.pollQueue());
        System.out.println(queue2.pollQueue());
        System.out.println(queue2.peakQueue());
        System.out.println(queue2.removeFromQueue());
        System.out.println(queue2.pollQueue());
        System.out.println(queue2.pollQueue());
        System.out.println(queue2.pollQueue());
        System.out.println(queue2.pollQueue());
    }

}



