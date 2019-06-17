package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex2_Tach_tu;

public class Ex2_Tach_tuTest {

    @Test
    public void test_liet_ke_tu() {
        Assert.assertEquals(new Ex2_Tach_tu().liet_ke_tu(
                "Công ty Co? Phan Song Ba 573 Núi Thành"), "ty, Phan, Song, Ba, 573");
    }
}