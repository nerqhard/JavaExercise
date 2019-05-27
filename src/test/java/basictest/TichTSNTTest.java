package basictest;

import basic.TichTSNT;
import org.junit.Test;

import static org.junit.Assert.*;

public class TichTSNTTest {

    @Test
    public void tichTSNT() {
        assertEquals(new TichTSNT().tichtstn(0),"So vua nhap khong phai so nguyen!!!" );
        assertEquals(new TichTSNT().tichtstn(-5),"So vua nhap khong phai so nguyen!!!" );
        assertEquals(new TichTSNT().tichtstn(600),"2 * 2 * 2 * 3 * 5 * 5"  );
    }
}