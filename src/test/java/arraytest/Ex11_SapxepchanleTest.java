package arraytest;

import array.Ex11_Sapxepchanle;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex11_SapxepchanleTest {

    @Test
    public void sap_xep_chan_le() {
        assertArrayEquals(new Ex11_Sapxepchanle().sap_xep_chan_le(new int[]{1, 2, 4, 5, 6, 7, 8, 10}), new int[]{7, 10, 8, 5, 6, 1, 4, 2});
    }
}