package bt1test;

import bt1.UCLNandBCNN;
import org.junit.Test;
import static org.junit.Assert.*;

public class UCLNandBCNNTest {
        @Test
        public void test_ucln() {
        assertEquals(new UCLNandBCNN().ucln(34, 56), 2);
        assertEquals(new UCLNandBCNN().ucln(0, 56), 0);
        }

        @Test
        public void test_bcnn() {
            assertEquals(new UCLNandBCNN().bcnn(34, 56), 952);
            assertEquals(new UCLNandBCNN().bcnn(34, 0), 0);
        }
    }

