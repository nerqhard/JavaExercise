package bt1test;

import bt1.TongCSSN;
import org.junit.Test;
import static org.junit.Assert.*;

public class TongCSSNTest {

    @Test
    public void test_tongcssn() {
        assertEquals(new TongCSSN().tcssn(365),14  );
    }

}
