package BT1Test;

import BT1.TichTSNT2;
import org.junit.Test;
import static org.junit.Assert.*;

public class TichTSNT2Test {

    @Test
    public void tichTSTN2() {
        assertEquals(new TichTSNT2().tichTSTN2(600),"2^3 * 3 * 5^2"  );
        assertEquals(new TichTSNT2().tichTSTN2(-5),"So vua nhap khong phai so nguyen!!!"  );
    }
}