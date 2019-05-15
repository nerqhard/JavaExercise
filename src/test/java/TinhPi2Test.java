import org.junit.Test;

import static org.junit.Assert.*;

public class TinhPi2Test {

    @Test
    public void tinhpi2() {
        assertEquals(new TinhPi2().tinhpi2(),3.14159,0.00001);
    }
}