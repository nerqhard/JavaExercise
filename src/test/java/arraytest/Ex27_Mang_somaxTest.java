package arraytest;

import array.Ex27_Mang_somax;
import org.junit.Assert;
import org.junit.Test;

public class Ex27_Mang_somaxTest {

    @Test
    public void mang_max() {
        Assert.assertArrayEquals(new Ex27_Mang_somax().mang_max(new int[]{3, 4, 5, 8, 1, 6, 9, 7, 5}, 4), new int[]{9, 8, 7, 6});
    }
}