package arraytest;

import array.Ex19_Sapxepxoanoc;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex19_SapxepxoanocTest {

    @Test
    public void test_sxep_xoanoc() {
        Assert.assertArrayEquals(new Ex19_Sapxepxoanoc().sxep_xoanoc(new int[][]{
                {4, 3, 6, 1},
                {8, 5, 2, 8},
                {9, 5, 7, 1},
                {2, 6, 3, 7}
        }), new int[][]{
                {1, 1, 2, 2},
                {7, 7, 8, 3},
                {6, 9, 8, 3},
                {6, 5, 5, 4}
        });
    }
}