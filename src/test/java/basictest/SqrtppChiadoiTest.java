package basictest;

import basic.SqrtppChiadoi;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtppChiadoiTest {

    @Test
    public void cbh_chiadoi() {
        assertEquals(new SqrtppChiadoi().cbh_chiadoi(3.5), 1.8708, 0.0001);
        assertEquals(new SqrtppChiadoi().cbh_chiadoi(15.1994), 3.8986, 0.0001);
    }
}