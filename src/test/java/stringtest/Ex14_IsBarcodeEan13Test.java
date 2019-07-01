package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex14_IsBarcodeEan13;


public class Ex14_IsBarcodeEan13Test {

    @Test
    public void test_isBarcode() {
        Ex14_IsBarcodeEan13 obj = new Ex14_IsBarcodeEan13();
        Assert.assertEquals(obj.isBarcode("6954851211167"), true);
        Assert.assertEquals(obj.isBarcode("6 954 85 121 11 67"), true);
        Assert.assertEquals(obj.isBarcode("6954851211163"), false);
        Assert.assertEquals(obj.isBarcode("695485121116312312"), false);
    }
}