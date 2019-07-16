package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex17_CalculateSub;

public class Ex17_CalculateSubTest {

    private Ex17_CalculateSub obj = new Ex17_CalculateSub();

    @Test
    public void test_isSmaller() {
        Assert.assertFalse(obj.isSmaller("13245", "456"));
        Assert.assertFalse(obj.isSmaller("13245", "13244"));
        Assert.assertTrue(obj.isSmaller("123", "13244"));
    }

    @Test
    public void test_calSub() {
        Assert.assertEquals(obj.calSub("10000045", "124678"), "9875367");
        Assert.assertEquals(obj.calSub("10000000", "9999999"), "1");
        Assert.assertEquals(obj.calSub("10000045", "1232"), "9998813");
        Assert.assertEquals(obj.calSub("1232", "10000045"), "-9998813");
    }
}