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
    public void test_equals() {
        Assert.assertTrue(input.equals(4, 4));
        Assert.assertFalse(input.equals(5, 4));
    }

    @Test
    public void test_get() {
        Assert.assertEquals(input.getA(), 6.000, 0.001);
        Assert.assertEquals(input.getB(), 6.000, 0.001);
        Assert.assertEquals(input.getC(), 8.485, 0.001);
    }

    @Test
    public void test_getType() {
        Assert.assertEquals(input.getType(), "Tam giac vuong can");
        Assert.assertEquals(new ExerciseTriangle(4, 10, 4, 3, 8, 3).getType(), "Tam giac vuong");
        Assert.assertEquals(new ExerciseTriangle(0, 0, 2.5, 4.3301, 5, 0).getType(), "Tam giac deu");
        Assert.assertEquals(new ExerciseTriangle(4, 3, 8, 11, 12, 3).getType(), "Tam giac can");
        Assert.assertEquals(new ExerciseTriangle(4, 3, 8, 10, 10, 5).getType(), "Tam giac thuong");
        Assert.assertEquals(new ExerciseTriangle(4, 3, 8, 3, 10, 3).getType(), "Tam giac khong hop le");
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(input.getPerimeter(), 20.485, 0.001);
    }

    @Test
    public void test_getArea() {
        Assert.assertEquals(input.getArea(), 18.0, 0.1);
    }
}