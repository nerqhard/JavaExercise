import org.junit.Test;

import static org.junit.Assert.*;

public class GiaithuaTest {

    @Test
    public void test_giaithua() {
        assertEquals(new Giaithua().giaithua(7),5040);
    }
}