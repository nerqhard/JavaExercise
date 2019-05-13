package BT1Test;
import BT1.TichTSNT;
import org.junit.Test;

import static org.junit.Assert.*;

public class TichTSNTTest {

    @Test
    public void tichTSNT() {
        assertEquals(new TichTSNT().TichTSNT(-5),"So vua nhap khong phai so nguyen!!!" );
        assertEquals(new TichTSNT().TichTSNT(600),"2 * 2 * 2 * 3 * 5 * 5"  );
    }
}