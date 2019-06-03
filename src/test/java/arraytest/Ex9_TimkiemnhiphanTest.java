package arraytest;

import array.Ex9_Timkiemnhiphan;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex9_TimkiemnhiphanTest {

    @Test
    public void tim_nhi_phan() {
        assertEquals(new Ex9_Timkiemnhiphan().tim_nhi_phan(new int[]{2, 3, 5, 6, 8, 11, 15}, 8), 4);
        assertEquals(new Ex9_Timkiemnhiphan().tim_nhi_phan(new int[]{2, 3, 5, 6, 8, 11, 15}, 9), -1);
    }
}