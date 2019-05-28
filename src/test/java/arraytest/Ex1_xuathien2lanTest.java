package arraytest;

import array.Ex1_xuathien2lan;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Ex1_xuathien2lanTest {

    @Test
    public void test_xh_hon_2_lan() {
        assertEquals(new Ex1_xuathien2lan().xh_hon_2_lan(new int[]{2, 4, 1, 4, 2, 2}), Arrays.asList(2));
        assertEquals(new Ex1_xuathien2lan().xh_hon_2_lan(new int[]{1, 1, 2, 2, 2, 1, 1,}), Arrays.asList(1, 2));
        assertEquals(new Ex1_xuathien2lan().xh_hon_2_lan(new int[]{2, 2, 1, 1, 1, 2, 1,}), Arrays.asList(2, 1));
        assertEquals(new Ex1_xuathien2lan().xh_hon_2_lan(new int[]{2, 3, 1, 1, 1, 2, 1, 3, 3, 2}), Arrays.asList(2, 3, 1));
    }
}