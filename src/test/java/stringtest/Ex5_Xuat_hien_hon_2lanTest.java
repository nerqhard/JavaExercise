package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex5_Xuat_hien_hon_2lan;

public class Ex5_Xuat_hien_hon_2lanTest {

    @Test
    public void test_xh_2lan() {
        Assert.assertEquals(new Ex5_Xuat_hien_hon_2lan().xh_2lan("haha hihi hihi hoho haha hehe haha hihi kaka"), "haha, hihi");
        Assert.assertEquals(new Ex5_Xuat_hien_hon_2lan().xh_2lan("a a a a b b c b"), "a, b");
    }
}