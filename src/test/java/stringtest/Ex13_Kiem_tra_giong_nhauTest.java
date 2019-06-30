package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex13_Kiem_tra_giong_nhau;

public class Ex13_Kiem_tra_giong_nhauTest {

    @Test
    public void test_kt_giong_nhau() {
        Assert.assertEquals(new Ex13_Kiem_tra_giong_nhau().kt_giong_nhau("abcd", "dcba"), true);
        Assert.assertEquals(new Ex13_Kiem_tra_giong_nhau().kt_giong_nhau("quang ha", "hang uaq"), true);
        Assert.assertEquals(new Ex13_Kiem_tra_giong_nhau().kt_giong_nhau("quang ha", "hang uaqt"), false);
        Assert.assertEquals(new Ex13_Kiem_tra_giong_nhau().kt_giong_nhau("quangr trij", "quang tri"), false);
    }
}