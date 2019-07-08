package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex15_FindNumBarcode;

public class Ex15_FindNumBarcodeTest {

    @Test
    public void findBarcode() {
        Ex15_FindNumBarcode obj = new Ex15_FindNumBarcode();
        Assert.assertEquals(obj.findBarcode("184043100645"), 4);
        Assert.assertEquals(obj.findBarcode("1 8404 3100 645"), 4);
        Assert.assertEquals(obj.findBarcode("899277206516"), 0);
    }
}