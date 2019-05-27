// Giải phương trình bậc 2
package basic;

public class PTB2 {

    public String ptb2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                   return "Phuong trinh vo so nghiem";
                } else {
                   return "Phuong trinh vo nghiem";
                }
            } else {
                double x1 = (-c/b);
                return String.format("Phuong trinh co 1 nghiem: x = %.2f", x1);
            }
        }else {
            double delta = b * b - 2 * a * c;
            if (delta > 0) {
                double x1 = ((-b + Math.sqrt(delta)) / 2 / a);
                double x2 = ((-b - Math.sqrt(delta)) / 2 / a);
                return String.format("Phuong trinh co 2 nghiem: x1 = %.2f va x2 = %.2f", x1, x2);
            } else {
                if (delta == 0) {
                    double x1 = (-b / 2 / a);
                    return String.format("Phuong trinh co 1 nghiem kep: x1 = x2 = %.2f", x1);
                } else {
                    return "Phuong trinh vo nghiem";
                }
            }
        }
    }
}
