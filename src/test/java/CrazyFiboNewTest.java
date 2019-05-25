import org.junit.Test;

import static org.junit.Assert.*;

public class CrazyFiboNewTest {

    @Test
    public void crazyfibonew() {
        assertEquals(new CrazyFiboNew().crazyfibonew(22, 1, 2, 4, 6, 2), 4);
        assertEquals(new CrazyFiboNew().crazyfibonew(7,6, 2, 2, 1, 4), 4);
        assertEquals(new CrazyFiboNew().crazyfibonew(1219046756389488493L,6, 7, 9, 6, 0), 3);
    }
}