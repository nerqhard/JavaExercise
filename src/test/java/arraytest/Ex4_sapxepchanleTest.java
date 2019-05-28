package arraytest;

import array.Ex4_sapxepchanle;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Ex4_sapxepchanleTest {

    @Test
    public void test_sx_chanle() {
        assertEquals(new Ex4_sapxepchanle().sx_chanle(new int[]{3, 4, 1, 2, 6, 5}), Arrays.asList(2, 4, 6, 5, 3, 1));
        assertEquals(new Ex4_sapxepchanle().sx_chanle(new int[]{3, 3, 2, 2, 6, 6, 8, 5}), Arrays.asList(2, 2, 6, 6, 8, 5, 3, 3));
    }
}