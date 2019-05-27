package basictest;

import basic.TongFibonacci;
import org.junit.Test;

import static org.junit.Assert.*;

public class TongFibonacciTest {

    @Test
    public void test_tongfibo() {
        assertEquals(new TongFibonacci().tongfibo(3),4);
        assertEquals(new TongFibonacci().tongfibo(7),33);
    }
}