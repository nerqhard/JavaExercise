package arraytest;

import array.Ex20_Tach_mang2c;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex20_Tach_mang2cTest {

    @Test
    public void test_tach_mang() {
        Assert.assertArrayEquals(new Ex20_Tach_mang2c().tach_mang(new int[][]{
                {1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {21, 22, 23, 24, 25},
                {31, 32, 33, 34, 35}
        }, 1, 1, 2, 2), new int[][]{
                {12, 13},
                {22, 23}
        });
        Assert.assertArrayEquals(new Ex20_Tach_mang2c().tach_mang(new int[][]{
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40}
        }, 7, 1, 4, 4), new int[][]{});
    }
}
