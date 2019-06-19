package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex4_Tong_so_String;

import static org.junit.Assert.*;

public class Ex4_Tong_so_StringTest {

    @Test
    public void test_sum_num() {
        Assert.assertEquals(new Ex4_Tong_so_String().sum_num("abc 123 def 33 mn 3.221"), 380);
    }
}