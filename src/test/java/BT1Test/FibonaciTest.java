package BT1Test;
import BT1.Fibonaci;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonaciTest {

    @Test
    public void fibonaci() {
        assertEquals(new Fibonaci().Fibonaci (44),"1 1 2 3 5 8 13 21 34"  );
    }
}