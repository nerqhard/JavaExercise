package ooptest;

import org.junit.Test;
import oop.ExerciseTriangle;
import org.junit.Assert;

public class ExerciseTriangleTest {

    private ExerciseTriangle input = new ExerciseTriangle(4, 4, 4, 10, 10, 4);

    @Test
    public void test_getLength() {
        Assert.assertEquals(input.getLength(4, 10, 10, 4), 8.485, 0.001);
    }

    @Test
    public void test_get() {
        Assert.assertEquals(input.getA(), 6.000, 0.001);
        Assert.assertEquals(input.getB(), 6.000, 0.001);
        Assert.assertEquals(input.getC(), 8.485, 0.001);
    }

    @Test
    public void test_getType() {
        Assert.assertEquals(input.getType(), "Tam giac Vuong Can");
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(input.getPerimeter(), 20.485, 0.001);
    }

    @Test
    public void test_getArea() {
        Assert.assertEquals(input.getArea(), 18.00, 0.01);
    }
}