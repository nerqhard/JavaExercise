package arraytest;

import array.Ex4_sapxepchanle;
import org.junit.Assert;
import org.junit.Test;


public class Ex4_sapxepchanleTest {

    @Test
    public void test_sx_chanle() {
        Assert.assertArrayEquals(new Ex4_sapxepchanle().sx_chanle(new int[]{3, 4, 1, 2, 6, 5}), new int[]{2, 4, 6, 5, 3, 1});
        Assert.assertArrayEquals(new Ex4_sapxepchanle().sx_chanle(new int[]{3, 3, 2, 2, 6, 6, 8, 5}), new int[]{2, 2, 6, 6, 8, 5, 3, 3});
    }
}