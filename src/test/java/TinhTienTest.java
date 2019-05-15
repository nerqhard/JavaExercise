import org.junit.Test;

import static org.junit.Assert.*;

public class TinhTienTest {

    @Test
    public void test_tinhtien() {
        assertEquals(new TinhTien().tinhtien(5),248.832,0.001);
        assertEquals(new TinhTien().tinhtien(12),261.304,0.001);
    }
}