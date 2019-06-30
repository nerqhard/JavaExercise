package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex9_Rut_gon;

import static org.junit.Assert.*;

public class Ex9_Rut_gonTest {

    @Test
    public void test_rut_gon() {
        Assert.assertEquals(new Ex9_Rut_gon().rut_gon("abcccceeeeeefd"), "abc4e6fd");
        Assert.assertEquals(new Ex9_Rut_gon().rut_gon("abbbbbbbbbbbbbc"), "ab13c");
    }
}