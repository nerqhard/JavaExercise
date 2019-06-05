package arraytest;

import array.Ex14_Xoan_oc_mang2c;
import org.junit.Assert;
import org.junit.Test;


public class Ex14_Xoan_oc_mang2cTest {

    @Test
    public void test_xoan_oc_mang2c() {
        Assert.assertArrayEquals(new Ex14_Xoan_oc_mang2c().xoan_oc_mang2c(
                new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}})
                , new int[]{1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9});

    }
}