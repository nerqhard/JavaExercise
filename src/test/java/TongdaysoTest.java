import org.junit.Test;
import static org.junit.Assert.*;

public class TongdaysoTest {

    @Test
    public void tongdayso() {
        assertEquals(new Tongdayso().TDSo(12),728);
        assertEquals(new Tongdayso().TDSo(-5),0);
    }
}