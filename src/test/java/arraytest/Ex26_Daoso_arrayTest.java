package arraytest;

import array.Ex26_Daoso_array;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex26_Daoso_arrayTest {

    @Test
    public void dao_so() {
        assertEquals(new Ex26_Daoso_array().dao_so(2468), 8642);
        assertEquals(new Ex26_Daoso_array().dao_so(90), 9);
    }

    @Test
    public void daoso_array() {
        assertEquals(new Ex26_Daoso_array().daoso_array(new int[]{21, 47, 115, 34, 20}), 642);
    }
}