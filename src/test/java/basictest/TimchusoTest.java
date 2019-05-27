package basictest;

import basic.Timchuso;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimchusoTest {

    @Test
    public void test_demcs() {
        assertEquals(new Timchuso().demcs(0),1);
        assertEquals(new Timchuso().demcs(354),3);
        assertEquals(new Timchuso().demcs(35154),5);
    }

    @Test
    public void test_valid() {
        assertEquals(new Timchuso().valid(370), true);
        assertEquals(new Timchuso().valid(151), false);
    }
    @Test
    public void test_timcso() {
        assertEquals(new Timchuso().timcso(), "153 370 371 407 1634 8208 9474 54748 92727 93084");
    }
}