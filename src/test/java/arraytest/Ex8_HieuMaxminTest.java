package arraytest;

import array.Ex8_HieuMaxmin;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex8_HieuMaxminTest {

    @Test
    public void test_sub_max_min() {
        assertEquals(new Ex8_HieuMaxmin().sub_max_min(new int[]{2, 6, 4, 3, 8, 11, 4}), 9);
    }
}