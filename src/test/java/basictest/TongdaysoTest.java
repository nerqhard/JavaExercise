package basictest;

import basic.Tongdayso;
import org.junit.Test;
import static org.junit.Assert.*;

public class TongdaysoTest {

    @Test
    public void tongdayso() {
        assertEquals(new Tongdayso().tdso(12),728);
        assertEquals(new Tongdayso().tdso(-5),0);
    }
}