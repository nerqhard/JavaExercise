import org.junit.Test;

import static org.junit.Assert.*;

public class DecimaltoRomanNumberTest {

    @Test
    public void dec_to_Roman() {
        assertEquals(new DecimaltoRomanNumber().Dec_to_Roman(1511), "MDXI");
        assertEquals(new DecimaltoRomanNumber().Dec_to_Roman(1982), "MCMLXXXII");
        assertEquals(new DecimaltoRomanNumber().Dec_to_Roman(0), "Invalid Roman Number Value");
        assertEquals(new DecimaltoRomanNumber().Dec_to_Roman(5000), "Invalid Roman Number Value");
    }
}