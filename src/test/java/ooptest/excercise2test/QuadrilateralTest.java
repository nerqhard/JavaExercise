package ooptest.excercise2test;

import org.junit.Test;
import oop.exercise2.Quadrilateral;
import org.junit.Assert;

public class QuadrilateralTest {

    @Test
    public void test_showInfo() {
        Assert.assertEquals(new Quadrilateral(3, 6, 5, 11, 13, 5, 7, 7).showInfo(),
                "Hinh tu giac. Dien tich: 19.000000000000018. Chu vi: 25.832825753088926");
        Assert.assertEquals(new Quadrilateral(3, 6, 5, 11, 13, 5, 6, 3).showInfo(),
                "Hinh tu giac. Dien tich: 39.499999999999986. Chu vi: 26.907915383534306");
        Assert.assertEquals(new Quadrilateral(0, 0, -1, 3, 3, 0, 5, 0).showInfo(),
                "Tu giac khong ton tai!!!");
    }

    @Test
    public void test_getArea() {
        Assert.assertEquals(new Quadrilateral(3, 6, 5, 11, 13, 5, 7, 7).getArea(), 19.0, 0.1);
        Assert.assertEquals(new Quadrilateral(3, 6, 5, 11, 13, 5, 6, 3).getArea(), 39.5, 0.1);
    }

    @Test
    public void test_getPerimeter() {
        Assert.assertEquals(new Quadrilateral(3, 6, 5, 11, 13, 5, 7, 7).getPerimeter(),
                25.83, 0.01);
        Assert.assertEquals(new Quadrilateral(3, 6, 5, 11, 13, 5, 6, 3).getPerimeter(),
                26.91, 0.01);
    }
}