package basictest;

import basic.TinhCanbachai;
import org.junit.Test;

import static org.junit.Assert.*;

public class TinhCanbachaiTest {

    @Test
    public void test_tinhcan() {
        assertEquals(new TinhCanbachai().tinhcan(5),2.2361,0.0001);
        assertEquals(new TinhCanbachai().tinhcan(1),1.0,0.0001);
    }
}