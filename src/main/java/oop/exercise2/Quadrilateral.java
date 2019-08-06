package oop.exercise2;

import static oop.exercise2.GeoUtils.*;

public class Quadrilateral implements Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;
    private double k;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.a = edgeShape(x1, y1, x2, y2);
        this.b = edgeShape(x2, y2, x3, y3);
        this.c = edgeShape(x3, y3, x4, y4);
        this.d = edgeShape(x4, y4, x1, y1);
        this.h = edgeShape(x1, y1, x3, y3);
        this.k = edgeShape(x2, y2, x4, y4);
    }

    @Override
    public String showInfo() {
        if (isTriangle(this.h, this.a, this.b) && isTriangle(this.h, this.c, this.d)
                && isTriangle(this.k, this.a, this.d) && isTriangle(this.k, this.b, this.c)) {
            return "Hinh tu giac. Dien tich: " + this.getArea() + ". Chu vi: " + this.getPerimeter();
        }
        return "Tu giac khong ton tai!!!";
    }

    private static double areaTriangle(double m, double n, double o) {
        double p = (m + n + o) / 2;
        return Math.sqrt(p * (p - m) * (p - n) * (p - o));
    }

    @Override
    public double getArea() {
        double s1 = areaTriangle(this.h, this.a, this.b) + areaTriangle(this.h, this.c, this.d);
        double s2 = areaTriangle(this.k, this.a, this.d) + areaTriangle(this.k, this.b, this.c);
        return (s1 < s2) ? s1 : s2;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c + this.d;
    }
}
