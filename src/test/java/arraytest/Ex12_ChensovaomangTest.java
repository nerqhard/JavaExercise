package arraytest;

import array.Ex12_Chensovaomang;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex12_ChensovaomangTest {

    @Test
    public void test_chen_so() {
        assertArrayEquals(new Ex12_Chensovaomang().chen_so(new int[]{2, 4, 6, 8, 12, 20}, 15), new int[]{2, 4, 6, 8, 12, 15, 20});
        assertArrayEquals(new Ex12_Chensovaomang().chen_so(new int[]{6, 20, 2, 8, 12, 4}, 15), new int[]{2, 4, 6, 8, 12, 15, 20});

    }
}