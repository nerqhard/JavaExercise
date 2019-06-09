package arraytest;

import array.Ex13_Xoaymang2chieu;
import org.junit.Assert;
import org.junit.Test;


public class Ex13_Xoaymang2chieuTest {

    @Test
    public void test_xoay_mang_2c() {
        Assert.assertArrayEquals(new Ex13_Xoaymang2chieu().xoay_mang_2c(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}}), new int[][]{{5, 1}, {6, 2}, {7, 3}, {8, 4}});
    }
}