import org.junit.Test;

import static org.junit.Assert.*;

public class TinhBieuthucTest {

    @Test
    public void test_bthuc() {
        assertEquals(new TinhBieuthuc().bthuc(5),2.717,0.001);
        assertEquals(new TinhBieuthuc().bthuc(0),1,0.001);
        assertEquals(new TinhBieuthuc().bthuc(-5),1,0.001);
    }
}