package bt1test;

import bt1.TichTSNT2;
import org.junit.Test;
import static org.junit.Assert.*;

public class TichTSNT2Test {

    @Test
    public void test_tichtstn2() {
        assertEquals(new TichTSNT2().tichtstn2(600),"2^3 * 3 * 5^2"  );
        assertEquals(new TichTSNT2().tichtstn2(-5),"So vua nhap khong phai so nguyen!!!"  );
        assertEquals(new TichTSNT2().tichtstn2(0),"So vua nhap khong phai so nguyen!!!"  );
    }
}