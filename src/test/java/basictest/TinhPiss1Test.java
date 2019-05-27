package basictest;

import basic.TinhPiss1;
import org.junit.Test;

import static org.junit.Assert.*;

public class TinhPiss1Test {

    @Test
    public void tinhpiss1() {
        assertEquals(new TinhPiss1().tinhpiss1(),3.1416,0.0001);
    }
}