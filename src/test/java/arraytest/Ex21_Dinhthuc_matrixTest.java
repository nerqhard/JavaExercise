package arraytest;

import array.Ex21_Dinhthuc_matrix;
import org.junit.Assert;
import org.junit.Test;

public class Ex21_Dinhthuc_matrixTest {

    @Test
    public void test_minor() {
        Assert.assertArrayEquals(new Ex21_Dinhthuc_matrix().minor(new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }, 2), new double[][]{
                {4, 5},
                {7, 8}
        });
    }

    @Test
    public void det_matrix() {
        Assert.assertEquals(new Ex21_Dinhthuc_matrix().det_matrix(new double[][]{
                {1, 5, 6, 2},
                {3, 9, 10, 1},
                {7, 9, 3, 5},
                {5, 8, 6, 2}
        }), 59, 0.1);
        Assert.assertEquals(new Ex21_Dinhthuc_matrix().det_matrix(new double[][]{
                {1.5, 5.1, 6.2, 2},
                {3, 9.3, 10, 1},
                {7.5, 9, 3, 5},
                {5, 8.4, 6, 2}
        }), 39.6, 0.01);
    }
}