package ooptest.excercise2test;

import oop.exercise2.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void test_showInfo() {
        assertEquals(new Circle(2, 3, 3).showInfo(), "Hinh tron. Dien tich: 28.274333882308138. Chu vi: 18.84955592153876");
        assertEquals(new Circle(2, 3, -1).showInfo(), "Hinh tron khong ton tai!!!");
        assertEquals(new Circle(2, 3, 0).showInfo(), "Hinh tron khong ton tai!!!");
    }

    @Test
    public void test_getArea() {
        assertEquals(new Circle(2, 3, 3).getArea(), 28.27, 0.01);
        assertEquals(new Circle(-5, 1, 5).getArea(), 78.54, 0.01);
    }

    @Test
    public void test_getPerimeter() {
        assertEquals(new Circle(2, 3, 3).getPerimeter(), 18.85, 0.01);
        assertEquals(new Circle(-5, 1, 5).getPerimeter(), 31.42, 0.01);

    }
}