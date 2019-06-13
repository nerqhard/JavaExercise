package arraytest;

import array.Ex24_BCNN_UCLN;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex24_BCNN_UCLNTest {

    @Test
    public void test_ucln() {
        assertEquals(new Ex24_BCNN_UCLN().ucln(34, 56), 2);
        assertEquals(new Ex24_BCNN_UCLN().ucln(0, 56), 0);
    }

    @Test
    public void test_bcnn() {
        assertEquals(new Ex24_BCNN_UCLN().bcnn(34, 56), 952);
        assertEquals(new Ex24_BCNN_UCLN().bcnn(34, 0), 0);
    }

    @Test
    public void test_bcnn_arr() {
        assertEquals(new Ex24_BCNN_UCLN().bcnn_arr(new int[]{5,6,4,7,3}),420);
    }

    @Test
    public void test_ucln_arr() {
        assertEquals(new Ex24_BCNN_UCLN().ucln_arr(new int[]{58,62,46,74,20}),2);
    }
}