package basictest;

import basic.CrazyFibonacci;
import org.junit.Test;

import static org.junit.Assert.*;

public class CrazyFibonacciTest {

    @Test
    public void test_crazyfibo() {
        assertEquals(new CrazyFibonacci().crazyfibo(6, 2, 2, 1, 4, 8), 0);
        assertEquals(new CrazyFibonacci().crazyfibo(6, 2, 2, 1, 4, 6), 4);
        assertEquals(new CrazyFibonacci().crazyfibo(6, 2, 2, 1, 4, 3), 1);
    }
}