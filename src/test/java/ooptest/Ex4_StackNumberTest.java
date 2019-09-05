package ooptest;

import oop.Ex4_StackNumber;
import org.junit.Assert;
import org.junit.Test;

public class Ex4_StackNumberTest {

    @Test

    public void test_isEmpty() {
        Ex4_StackNumber<Integer> stackNumber = new Ex4_StackNumber<>();
        Assert.assertTrue(stackNumber.isEmpty());
    }

    @Test
    public void test_push() {
        Ex4_StackNumber<Integer> stackNumber = new Ex4_StackNumber<>();
        stackNumber.push(15);
        Assert.assertFalse(stackNumber.isEmpty());
    }

    @Test
    public void test_pop() {
        Ex4_StackNumber<Integer> stackNumber = new Ex4_StackNumber<>();
        Assert.assertNull(stackNumber.pop());
        stackNumber.push(1);
        stackNumber.push(5);
        stackNumber.push(19);
        stackNumber.push(94);
        Assert.assertEquals((int) stackNumber.pop(), 94);
    }

    @Test
    public void test_peek() {
        Ex4_StackNumber<Integer> stackNumber = new Ex4_StackNumber<>();
        Assert.assertNull(stackNumber.peek());
        stackNumber.push(10);
        stackNumber.push(4);
        stackNumber.push(19);
        stackNumber.push(94);
        Assert.assertEquals((int) stackNumber.peek(), 10);
    }
}