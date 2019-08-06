package oop;

public class ExerciseTriangle {
    private double a;
    private double b;
    private double c;

    public static double getLength(double a1, double b1, double a2, double b2) {
        return Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
    }

    public static boolean equals(double x, double y) {
        return Math.round((x) * 1000 / 1000) == Math.round(((y)) * 1000 / 1000);
    }

    public ExerciseTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.a = getLength(x1, y1, x2, y2);
        this.b = getLength(x1, y1, x3, y3);
        this.c = getLength(x2, y2, x3, y3);
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public String getType() {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (equals(a, b) && equals(a, c)) {
                return "Tam giac deu";
            }

            if (equals(c * c, a * a + b * b) || equals(b * b, a * a + c * c) || equals(a * a, b * b + c * c)) {
                if ((a - b) * (a - c) * (b - c) == 0) {
                    return "Tam giac vuong can";
                }
                return "Tam giac vuong";
            }

            if ((a - b) * (a - c) * (b - c) == 0) {
                return "Tam giac can";
            }
            return "Tam giac thuong";
        }
        return "Tam giac khong hop le";
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
