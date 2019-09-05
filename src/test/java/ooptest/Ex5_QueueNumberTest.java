package ooptest;

import oop.Ex5_QueueNumber;
import org.junit.Assert;
import org.junit.Test;

public class Ex5_QueueNumberTest {

    @Test
    public void test_enqueue() {
        Ex5_QueueNumber<Integer> queueNumber = new Ex5_QueueNumber<>();
        queueNumber.enqueue(15);
        Assert.assertFalse(queueNumber.isEmpty());
    }

    @Test
    public void test_dequeue() {
        Ex5_QueueNumber<Integer> queueNumber = new Ex5_QueueNumber<>();
        Assert.assertNull(queueNumber.dequeue());
        queueNumber.enqueue(10);
        queueNumber.enqueue(4);
        queueNumber.enqueue(1994);
        Assert.assertEquals((int) queueNumber.dequeue(), 10);
        Assert.assertEquals((int) queueNumber.dequeue(), 4);
    }

    @Test
    public void test_peek() {
        Ex5_QueueNumber<Integer> queueNumber = new Ex5_QueueNumber<>();
        Assert.assertNull(queueNumber.peek());
        queueNumber.enqueue(1);
        queueNumber.enqueue(5);
        queueNumber.enqueue(1994);
        Assert.assertEquals((int) queueNumber.peek(), 1);
    }

    @Test
    public void isEmpty() {
        Ex5_QueueNumber<Integer> queueNumber = new Ex5_QueueNumber<>();
        Assert.assertTrue(queueNumber.isEmpty());

    }
}