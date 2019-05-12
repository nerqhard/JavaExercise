package BT1Test;

import BT1.UCLNandBCNN;
import org.junit.Test;

import static org.junit.Assert.*;

public class UCLNandBCNNTest {
        @Test
        public void test_UCLN() {
        assertEquals(new UCLNandBCNN().UCLN(4, 6), 2);
        }
        @Test
        public void test_BCNN() {
            assertEquals(new UCLNandBCNN().BCNN(4, 6), 12);
        }
    }

