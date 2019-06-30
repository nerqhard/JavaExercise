package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex12_Xoa_ki_tu;

public class Ex12_Xoa_ki_tuTest {

    @Test
    public void test_del_char() {
        Assert.assertEquals(new Ex12_Xoa_ki_tu().del_char("abbbbbbccccd eeffffddbc"), "abcd efdbc");
    }
}