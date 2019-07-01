package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex10_Phan_tich;

public class Ex10_Phan_tichTest {

    @Test
    public void test_phan_tich() {
        Assert.assertEquals(new Ex10_Phan_tich().phan_tich("abc4e6fd"), "abcccceeeeeefd");
        Assert.assertEquals(new Ex10_Phan_tich().phan_tich("ab13c"), "abbbbbbbbbbbbbc");
    }
}