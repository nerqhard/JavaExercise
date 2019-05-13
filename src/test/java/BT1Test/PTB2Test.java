package BT1Test;
import BT1.PTB2;
import org.junit.Test;

import static org.junit.Assert.*;

public class PTB2Test {

    @Test
    public void PTB2() {
        assertEquals(new PTB2().PTB2 (0,0,0 ),"Phuong trinh vo so nghiem"  );
        assertEquals(new PTB2().PTB2 (0,0,3 ),"Phuong trinh vo nghiem"  );
        assertEquals(new PTB2().PTB2 (0,3,-5 ),"Phuong trinh co 1 nghiem: x = 1.67"  );
        assertEquals(new PTB2().PTB2 (2,3,4 ),"Phuong trinh vo nghiem"  );
        assertEquals(new PTB2().PTB2 (-2,3,7 ),"Phuong trinh co 2 nghiem: x1 = -0.77 va x2 = 2.27"  );
        assertEquals(new PTB2().PTB2 (-1,3,-4.5 ),"Phuong trinh co 1 nghiem kep: x1 = x2 = 1.5"  );
    }
}