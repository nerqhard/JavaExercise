package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex5_Xuat_hien_hon_2lan;

public class Ex5_Xuat_hien_hon_2lanTest {

    @Test
    public void test_xh_2lan() {
        Assert.assertEquals(new Ex5_Xuat_hien_hon_2lan().xh_2lan("haha hihi hihi hoho haha hehe haha hihi kaka"), "haha, hihi");
<<<<<<< HEAD
        Assert.assertEquals(new Ex5_Xuat_hien_hon_2lan().xh_2lan("a a a a b b c b"), "a, b");
=======
        Assert.assertEquals(new Ex5_Xuat_hien_hon_2lan().xh_2lan("a a a a"), "a");
>>>>>>> 6a1078f37f5a5b570a8c52da67cdac8dc9b08ddd
    }
}
