package stringtest;

import org.junit.Assert;
import org.junit.Test;
import string.Ex16_CalculateSum;

public class Ex16_CalculateSumTest {

    @Test
    public void test_calSum() {
        Ex16_CalculateSum obj = new Ex16_CalculateSum();
        Assert.assertEquals(obj.calSum("786", "6798"), "7584");
        Assert.assertEquals(obj.calSum("94", "5115"), "5209");
        Assert.assertEquals(obj.calSum("9898", "354"), "10252");
        Assert.assertEquals(obj.calSum("128", "99973"), "100101");
    }
}