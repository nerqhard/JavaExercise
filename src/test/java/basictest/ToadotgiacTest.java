package basictest;

import basic.Toadotgiac;
import org.junit.Test;

import static org.junit.Assert.*;

public class ToadotgiacTest {

    @Test
    public void test_tdtgiac() {
        assertEquals(new Toadotgiac().tdtgiac(2,6,4,3,7,5),"Tam giac vuong. Dien tich: 6.50. Chu vi: 12.31" );
        assertEquals(new Toadotgiac().tdtgiac(4,4,6,6,4,8),"Tam giac can. Dien tich: 4.00. Chu vi: 9.66" );
        assertEquals(new Toadotgiac().tdtgiac(4,2,6,7,4,9),"Tam giac thuong. Dien tich: 7.00. Chu vi: 15.21" );
        assertEquals(new Toadotgiac().tdtgiac(1,2,3,4,5,6),"Tam giac khong ton tai!!!" );
    }
}