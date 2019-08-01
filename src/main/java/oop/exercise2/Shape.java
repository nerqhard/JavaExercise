package oop.exercise2;

public interface Shape {
    String showInfo();

    double getArea();

    double getPerimeter();

    default double edgeShape(double a1, double b1, double a2, double b2) {
        return Math.sqrt((a1 - a2) * (a1 - a2) + (b1 - b2) * (b1 - b2));
    }

    default boolean isTriangle(double a, double b, double c) {
        return ((a < b + c) && (b < a + c) && (c < b + a));
    }
}
