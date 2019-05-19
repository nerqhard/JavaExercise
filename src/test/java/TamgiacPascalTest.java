import org.junit.Test;

import static org.junit.Assert.*;

public class TamgiacPascalTest {

    @Test
    public void test_tgpascal() {
        assertArrayEquals(new TamgiacPascal().tgpascal(7), new int[]{1, 7, 21, 35, 35, 21, 7, 1});
    }
}