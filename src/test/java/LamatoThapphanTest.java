import org.junit.Test;

import static org.junit.Assert.*;

public class LamatoThapphanTest {

    @Test
    public void test_lama_to_thapphan() {
        assertEquals(new LamatoThapphan().lama_to_thapphan("MCMLXXXII"), 1982);
        assertEquals(new LamatoThapphan().lama_to_thapphan("mmxvii"), 2017);
        assertEquals(new LamatoThapphan().lama_to_thapphan("M"), 1000);
    }
}