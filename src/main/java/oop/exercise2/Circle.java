package oop.exercise2;

public class Circle implements Shape {
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String showInfo() {
        if (r <= 0) {
            return "Hinh tron khong ton tai!!!";
        }
        return "Hinh tron. Dien tich: " + this.getArea() + ". Chu vi: " + this.getPerimeter();
    }

    @Override
    public double getArea() {
        return Math.PI * this.r * this.r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}
