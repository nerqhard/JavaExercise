package arraytest;

import array.Ex22_Del_RowCol;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex22_Del_RowColTest {

    @Test
    public void test_del_rowcol() {
        Assert.assertArrayEquals(new Ex22_Del_RowCol().del_rowcol(new double[][]{
                {2, 4, 5, 6, 2, 4},
                {5, 1, 7, 8, 3, 9},
                {1, 5, 3, 7, 4, 7},
                {3, 8, 2, 7, 8, 5}
        }, 3, 2), new double[][]{
                {2, 4, 6, 2, 4},
                {5, 1, 8, 3, 9},
                {1, 5, 7, 4, 7}
        });
    }
}