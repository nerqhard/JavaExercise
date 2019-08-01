package oop;

public class ExerciseTriangle {
    private double a;
    private double b;
    private double c;

    public double getLength(int a1, int b1, int a2, int b2) {
        return Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
    }

    public ExerciseTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
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
        if ((this.a + this.b > this.c) && (this.a + this.c > this.b) && (this.b + this.c > this.a)) {
            if ((this.a == this.b) && (this.a == this.c)) {
                return "Tam giac Deu";
            }

            if ((Math.round((this.c * this.c) * 1000 / 1000) == Math.round(((this.a * this.a + this.b * this.b)) * 1000 / 1000)) ||
                    (Math.round((this.b * this.b) * 1000 / 1000) == Math.round((this.a * this.a + this.c * this.c) * 1000 / 1000)) ||
                    Math.round((this.a * this.a) * 1000 / 1000) == Math.round((this.b * this.b + this.c * this.c) * 1000 / 1000)) {
                if ((this.a - this.b) * (this.a - this.c) * (this.b - this.c) == 0) {
                    return "Tam giac Vuong Can";
                }
                return "Tam giac Vuong";
            }

            if ((this.a - this.b) * (this.a - this.c) * (this.b - this.c) == 0) {
                return "Tam giac Can";
            }
            return "Tam giac thuong";
        }
        return "Tam giac khong hop le";
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }
}
