package arraytest;

import array.Ex17_Matran_xoanoc;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Ex17_Matran_xoanocTest {

    @Test
    public void mtran_xoanoc() {
        Assert.assertArrayEquals(new Ex17_Matran_xoanoc().mtran_xoanoc(5), new int[][]{
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}});
    }
}