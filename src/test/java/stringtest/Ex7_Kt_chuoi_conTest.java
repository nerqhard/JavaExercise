package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex7_Kt_chuoi_con;

import static org.junit.Assert.*;

public class Ex7_Kt_chuoi_conTest {

    @Test
    public void test_check_sub_str() {
        Assert.assertEquals(new Ex7_Kt_chuoi_con().check_sub_str("Nguyen Quang Ha", "uang H"),8);
        Assert.assertEquals(new Ex7_Kt_chuoi_con().check_sub_str("Nguyen Quang Ha", "Nguy"),0);
        Assert.assertEquals(new Ex7_Kt_chuoi_con().check_sub_str("Nguyen Quang Ha", "uang h"),-1);
    }
}