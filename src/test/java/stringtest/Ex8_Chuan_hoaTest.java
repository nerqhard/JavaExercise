package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex8_Chuan_hoa;

public class Ex8_Chuan_hoaTest {

    @Test
    public void test_chuan_hoa() {
        Assert.assertEquals(new Ex8_Chuan_hoa().chuan_hoa(
                "after,the After.the! party We're GONna    keep?it going"),
                "After, the after. The! Party we're gonna keep? It going");
    }
}