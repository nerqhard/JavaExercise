package ooptest.excercise2test;

import oop.exercise2.Triangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void test_showInfo() {
        assertEquals(new Triangle(3, 6, 6, 3, 5, 11).showInfo(),
                "Hinh tam giac. Dien tich: 10.499999999999998. Chu vi: 17.690063242552338");
        assertEquals(new Triangle(5, 6, 5, 3, 5, 11).showInfo(),
                "Tam giac khong ton tai!!!");
    }

    @Test
    public void test_getArea() {
        assertEquals(new Triangle(3, 6, 6, 3, 5, 11).getArea(), 10.5, 0.1);
    }

    @Test
    public void test_getPerimeter() {
        assertEquals(new Triangle(3, 6, 6, 3, 5, 11).getPerimeter(), 17.7, 0.1);
    }
}