import org.junit.Test;

import static org.junit.Assert.*;

public class DecimaltoRomanNumberTest {

    @Test
    public void dec_to_Roman() {
        assertEquals(new DecimaltoRomanNumber().dec_to_roman(1511), "MDXI");
        assertEquals(new DecimaltoRomanNumber().dec_to_roman(1982), "MCMLXXXII");
        assertEquals(new DecimaltoRomanNumber().dec_to_roman(0), "Invalid Roman Number Value");
        assertEquals(new DecimaltoRomanNumber().dec_to_roman(5000), "Invalid Roman Number Value");
    }
}