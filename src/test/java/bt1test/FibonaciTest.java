package bt1test;

import bt1.Fibonaci;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonaciTest {

    @Test
    public void test_fibonaci() {
        assertEquals(new Fibonaci().fibonaci (44),"1 1 2 3 5 8 13 21 34"  );
        assertEquals(new Fibonaci().fibonaci (-3),"So nhap khong phai so nguyen"  );
        assertEquals(new Fibonaci().fibonaci (0),"So nhap khong phai so nguyen"  );
    }
}