import org.junit.Test;

import static org.junit.Assert.*;

public class TinhBieuthucTest {

    @Test
    public void test_bieuthuc() {
        assertEquals(new TinhBieuthuc().bieuthuc(5),2.717,0.001);
        assertEquals(new TinhBieuthuc().bieuthuc(0),1,0.001);
        assertEquals(new TinhBieuthuc().bieuthuc(-5),1,0.001);
    }
}