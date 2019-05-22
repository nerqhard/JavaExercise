import org.junit.Test;

import static org.junit.Assert.*;

public class SoluongFibonacciTest {

    @Test
    public void test_sofibonacci() {
        assertEquals(new SoluongFibonacci().sofibonacci(90), 11);
        assertEquals(new SoluongFibonacci().sofibonacci(0), 0);
    }
}