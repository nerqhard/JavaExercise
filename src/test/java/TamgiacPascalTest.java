import org.junit.Test;

import static org.junit.Assert.*;

public class TamgiacPascalTest {

    @Test
    public void test_tgpascal() {
        assertEquals(new TamgiacPascal().tgpascal(4),"1 3 3 1");
        assertEquals(new TamgiacPascal().tgpascal(6),"1 5 10 10 5 1");
    }
}