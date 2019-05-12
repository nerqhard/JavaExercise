package BT1Test;

import BT1.TongCSSN;
import org.junit.Test;
import static org.junit.Assert.*;

public class TongCSSNTest {
    @Test
    public void test_TongCSSN() {
        assertEquals(new TongCSSN().TCSSN(365),14  );
    }

}
