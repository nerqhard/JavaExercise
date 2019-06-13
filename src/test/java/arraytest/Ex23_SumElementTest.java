package arraytest;

import array.Ex23_SumElement;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ex23_SumElementTest {

    @Test
    public void sum_elements() {
        assertEquals(new Ex23_SumElement().sum_elements(new int[]{0, 1, -2, 8, 9, 0, 1, -2, 1, 1, 3, 1, 1}), 18);
    }
}