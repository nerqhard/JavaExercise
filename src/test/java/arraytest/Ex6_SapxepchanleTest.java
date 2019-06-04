package arraytest;

import array.Ex6_Sapxepchanle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex6_SapxepchanleTest {

    @Test
    public void test_sortarr() {
        Assert.assertArrayEquals(new Ex6_Sapxepchanle().sortarr(new int[]{2, 6, 5, 8, 7, 3, 10, 6}), new int[]{2, 6, 7, 6, 5, 3, 8, 10});
    }
}