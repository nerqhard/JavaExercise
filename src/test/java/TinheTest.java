import org.junit.Test;

import static org.junit.Assert.*;

public class TinheTest {

    @Test
    public void test_tinhe() {
        assertEquals(new Tinhe().tinhe(),2.71828,0.00001);
    }
}