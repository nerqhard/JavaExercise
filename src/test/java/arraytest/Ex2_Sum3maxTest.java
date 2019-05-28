package arraytest;

import array.Ex2_Sum3max;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2_Sum3maxTest {

    @Test
    public void tong_3_so_max() {
        assertEquals(new Ex2_Sum3max().tong_3_so_max(new int[]{2, 5, 4, 3, 8}), 17);
        assertEquals(new Ex2_Sum3max().tong_3_so_max(new int[]{2, 5, 4, 5, 8}), 18);
        assertEquals(new Ex2_Sum3max().tong_3_so_max(new int[]{2, 5, 4, 5, 8, 5, 8}), 21);
    }
}