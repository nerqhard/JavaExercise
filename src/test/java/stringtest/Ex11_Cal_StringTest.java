package stringtest;

import org.junit.Test;
import string.Ex11_Cal_String;

import static org.junit.Assert.*;

public class Ex11_Cal_StringTest {

    @Test
    public void test_cal_string() {
        assertEquals(new Ex11_Cal_String().cal_string("123+456"), 579, 0.1);
        assertEquals(new Ex11_Cal_String().cal_string("123-456"), -333, 0.1);
        assertEquals(new Ex11_Cal_String().cal_string("15*94"), 1410, 0.1);
        assertEquals(new Ex11_Cal_String().cal_string("1994/15"), 132.93, 0.01);
        assertEquals(new Ex11_Cal_String().cal_string("15^4"), 50625, 0.1);
        assertEquals(new Ex11_Cal_String().cal_string("15<<2"), 60, 0.1);
        assertEquals(new Ex11_Cal_String().cal_string("16>>3"), 2, 0.1);
    }
}