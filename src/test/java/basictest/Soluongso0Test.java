package basictest;

import basic.Soluongso0;
import org.junit.Test;

import static org.junit.Assert.*;

public class Soluongso0Test {

    @Test
    public void demso0() {
        assertEquals(new Soluongso0().demso0(10), 2);
        assertEquals(new Soluongso0().demso0(25), 6);
        assertEquals(new Soluongso0().demso0(100), 24);
        assertEquals(new Soluongso0().demso0(1000000), 249998);
    }
}