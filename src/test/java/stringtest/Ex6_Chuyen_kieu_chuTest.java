package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex6_Chuyen_kieu_chu;

public class Ex6_Chuyen_kieu_chuTest {

    @Test
    public void test_cover_word() {
        Assert.assertEquals(new Ex6_Chuyen_kieu_chu().cover_word("Nguyen Quang Ha 12THXD"), "nGUYEN qUANG hA 12thxd");
    }
}