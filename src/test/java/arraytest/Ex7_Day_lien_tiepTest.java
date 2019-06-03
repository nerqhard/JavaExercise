package arraytest;

import array.Ex7_Day_lien_tiep;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Ex7_Day_lien_tiepTest {

    @Test
    public void test_arr_lien_tiep() {
        assertEquals(new Ex7_Day_lien_tiep().arr_lien_tiep(new int[]{1, 2, 2, 3, 4, 2, 5, 7, 8, 1, 3}), Arrays.asList(2, 5, 7, 8));
        assertEquals(new Ex7_Day_lien_tiep().arr_lien_tiep(new int[]{9, 8, 7, 6, 4, 2, 1}), Arrays.asList(9));
    }
}