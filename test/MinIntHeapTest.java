
import org.junit.Assert;
import org.junit.Test;

public class MinIntHeapTest {

    @Test
    public void canAddToHeap() {
        MinIntHeap heap = new MinIntHeap();
        heap.add(4);
        heap.add(2);
        Assert.assertEquals(2, heap.peek());
    }

    @Test
    public void canPollFromHeap() {
        MinIntHeap heap = new MinIntHeap();
        heap.add(4);
        heap.add(2);

        Assert.assertEquals(2, heap.poll());
        Assert.assertEquals(4, heap.peek());
    }
}
