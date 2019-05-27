package basictest;

import basic.DaoSoNhiPhan;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaoSoNhiPhanTest {

    @Test
    public void test_daoso() {
        assertEquals(new DaoSoNhiPhan().daoso(43),53);
        assertEquals(new DaoSoNhiPhan().daoso(23),29);
    }
}