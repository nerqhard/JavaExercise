package basictest;

import basic.TinhPi2;
import org.junit.Test;

import static org.junit.Assert.*;

public class TinhPi2Test {

    @Test
    public void test_tinhpi2() {
        assertEquals(new TinhPi2().tinhpi2(),3.14159,0.00001);
    }
}