package basictest;

import basic.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void test_nam_thoa_man() {
        assertEquals(new DateUtils().nam_thoa_man(1999), true);
        assertEquals(new DateUtils().nam_thoa_man(1780), false);
        assertEquals(new DateUtils().nam_thoa_man(3015), false);
    }

    @Test
    public void test_thang_thoa_man() {
        assertEquals(new DateUtils().thang_thoa_man(7), true);
        assertEquals(new DateUtils().thang_thoa_man(0), false);
        assertEquals(new DateUtils().thang_thoa_man(1994), false);
    }

    @Test
    public void test_ngay_thoa_man() {
        assertEquals(new DateUtils().ngay_thoa_man(5, 30), true);
        assertEquals(new DateUtils().ngay_thoa_man(0, 30), false);
        assertEquals(new DateUtils().ngay_thoa_man(32, 30), false);
    }

    @Test
    public void test_kt_nam_nhuan() {
        assertEquals(new DateUtils().kt_nam_nhuan(2000), true);
        assertEquals(new DateUtils().kt_nam_nhuan(2004), true);
        assertEquals(new DateUtils().kt_nam_nhuan(1994), false);
        assertEquals(new DateUtils().kt_nam_nhuan(1990), false);
    }

    @Test
    public void test_so_ngay_cua_nam() {
        assertEquals(new DateUtils().so_ngay_cua_nam(2000), 366);
        assertEquals(new DateUtils().so_ngay_cua_nam(1994), 365);
    }

    @Test
    public void test_so_ngay_cua_thang() {
        assertEquals(new DateUtils().so_ngay_cua_thang(3, 1994), 31);
        assertEquals(new DateUtils().so_ngay_cua_thang(11, 2019), 30);
        assertEquals(new DateUtils().so_ngay_cua_thang(2, 2019), 28);
        assertEquals(new DateUtils().so_ngay_cua_thang(2, 2020), 29);
    }

    @Test
    public void test_chuyen_string_to_date() {
        String inpstr = "01/05/1994";
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date inpdate = null;
        try {
            inpdate = df.parse(inpstr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        assertEquals(new DateUtils().chuyen_string_to_date("01/05/1994", new SimpleDateFormat("dd/mm/yyyy")), inpdate);
        assertEquals(new DateUtils().chuyen_string_to_date("01805/1888", new SimpleDateFormat("dd/mm/yyyy")), null);
    }

    @Test
    public void test_gan_ngay() {
        assertEquals(new DateUtils().gan_ngay("01/05/1994"), 01);
    }

    @Test
    public void test_gan_thang() {
        assertEquals(new DateUtils().gan_thang("01/05/1994"), 05);
    }

    @Test
    public void test_gan_nam() {
        assertEquals(new DateUtils().gan_nam("01/05/1994"), 1994);
    }

    @Test
    public void test_ddmmyy_thoa_man() {
        assertEquals(new DateUtils().ddmmyy_thoa_man("01/05/1994", new SimpleDateFormat("dd/MM/yyyy")), true);
        assertEquals(new DateUtils().ddmmyy_thoa_man("32/05/1994", new SimpleDateFormat("dd/MM/yyyy")), false);
        assertEquals(new DateUtils().ddmmyy_thoa_man("01/15/1994", new SimpleDateFormat("dd/MM/yyyy")), false);
        assertEquals(new DateUtils().ddmmyy_thoa_man("01/05/3025", new SimpleDateFormat("dd/MM/yyyy")), false);
        assertEquals(new DateUtils().ddmmyy_thoa_man("01/05", new SimpleDateFormat("dd/MM/yyyy")), false);
    }

    @Test
    public void test_ngay_da_qua_tu_1900() {
        assertEquals(new DateUtils().ngay_da_qua_tu_1900(2019), 43464);
    }

    @Test
    public void test_ngay_da_qua_trong_nam() {
        assertEquals((new DateUtils().ngay_da_qua_trong_nam(01, 05, 1994)), 121);
    }

    @Test
    public void test_so_ngay_con_lai_thang() {
        assertEquals(new DateUtils().so_ngay_con_lai_thang("01/05/2019"), 30);
    }

    @Test(expected = RuntimeException.class)
    public void test_so_ngay_con_lai_thang_invaliddate() {
        assertEquals(new DateUtils().so_ngay_con_lai_thang("00/21/2019"), 0);
    }

    @Test
    public void test_so_ngay_con_lai_nam() {
        assertEquals(new DateUtils().so_ngay_con_lai_nam("01/05/2019"), 244);
    }

    @Test(expected = RuntimeException.class)
    public void test_so_ngay_con_lai_nam_invaliddate() {
        assertEquals(new DateUtils().so_ngay_con_lai_nam("0105/3002"), 0);
    }

    @Test
    public void test_thu_trong_ngay() {
        assertEquals(new DateUtils().thu_trong_ngay("21/05/2019"), "Tuesday");
    }

    @Test(expected = RuntimeException.class)
    public void test_thu_trong_ngay_invaliddate() {
        assertEquals(new DateUtils().thu_trong_ngay("32/052019"), 0);
    }
}