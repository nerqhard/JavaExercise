package oop.exercise2;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = edgeShape(x1, y1, x2, y2);
        this.b = edgeShape(x1, y1, x3, y3);
        this.c = edgeShape(x2, y2, x3, y3);
    }

    @Override
    public String showInfo() {
        if (isTriangle(this.a, this.b, this.c)) {
            return "Hinh tam giac. Dien tich: " + this.getArea() + ". Chu vi: " + this.getPerimeter();
        }
        return "Tam giac khong ton tai!!!";
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }
}
