package arraytest;

import array.Ex3_Chan_tru_le;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex3_Chan_tru_leTest {

    @Test
    public void chan_tr_le() {
        assertEquals(new Ex3_Chan_tru_le().chan_tr_le(new int[]{4, 5, 8, 4, 7, 3, 1, 6}), 6);
    }
}