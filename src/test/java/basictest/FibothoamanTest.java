package basictest;

import basic.Fibothoaman;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibothoamanTest {

    @Test
    public void test_fibo_thoaman() {
        assertEquals(new Fibothoaman().fibo_thoaman(6, 400), 9);
        assertEquals(new Fibothoaman().fibo_thoaman(3, 55), 7);
    }
}