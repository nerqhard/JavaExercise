package arraytest;

import array.Ex5_Tongsonguyento;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex5_TongsonguyentoTest {

    @Test
    public void test_nguyento() {
        assertEquals(new Ex5_Tongsonguyento().nguyento(1), false);
        assertEquals(new Ex5_Tongsonguyento().nguyento(2), true);
        assertEquals(new Ex5_Tongsonguyento().nguyento(5), true);
        assertEquals(new Ex5_Tongsonguyento().nguyento(18), false);
    }

    @Test
    public void test_tong_so_nto() {
        assertEquals(new Ex5_Tongsonguyento().tong_so_nto(new int[]{2, 1, 5, 10, 55, 77, 16}), 7);
    }
}