import org.junit.Test;

import static org.junit.Assert.*;

public class KtraTamgiacTest {

    @Test
    public void test_ktratgiac() {
        assertEquals(new KtraTamgiac().ktratgiac(3,4,5),"Tam giac vuong. Dien tich: 6.00. Chu vi: 12.00" );
        assertEquals(new KtraTamgiac().ktratgiac(6,6,8),"Tam giac can. Dien tich: 17.89. Chu vi: 20.00" );
        assertEquals(new KtraTamgiac().ktratgiac(4,5,7),"Tam giac thuong. Dien tich: 9.80. Chu vi: 16.00" );
        assertEquals(new KtraTamgiac().ktratgiac(4,5,10),"Tam giac khong ton tai!!!" );
    }
}