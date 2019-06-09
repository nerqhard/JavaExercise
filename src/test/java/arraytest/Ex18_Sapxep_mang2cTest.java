package arraytest;

import array.Ex18_Sapxep_mang2c;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex18_Sapxep_mang2cTest {

    @Test
    public void sapxep_2c() {
        Assert.assertArrayEquals(new Ex18_Sapxep_mang2c().sapxep_2c(
                new int [][]{
                        {8,1,5,3},
                        {2,6,4,1},
                        {9,5,3,8}
                })
                ,new int[][]{
                        {3,2,1,1},
                        {5,5,4,3},
                        {9,8,8,6}
                });
    }
}