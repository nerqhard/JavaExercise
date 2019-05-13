// Giải phương trình bậc 2
package BT1;
public class PTB2 {
    public String PTB2(double a, double b, double c) {
        double delta;
        double x1, x2;
        //String kq = "";

    // Kiem tra gia tri a
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                   return "Phuong trinh vo so nghiem";
                }
                else {
                    return "Phuong trinh vo nghiem";
                }
            }
            else {
                x1 = (double) Math.round(-c/b*100)/100;
                return "Phuong trinh co 1 nghiem: x = " + x1;
            }
        }
        else {
            delta = b * b - 2 * a * c;
            if (delta > 0) {
                x1 = (double) Math.round(((-b + Math.sqrt(delta)) / 2 / a)*100)/100;
                x2 = (double) Math.round(((-b - Math.sqrt(delta)) / 2 / a)*100)/100;
                return "Phuong trinh co 2 nghiem: x1 = " + x1 + " va x2 = " + x2;
            } else {
                if (delta == 0) {
                    x1 = (double) Math.round((-b / 2 / a)*100)/100;
                    return "Phuong trinh co 1 nghiem kep: x1 = x2 = " + x1;
                } else {
                    return "Phuong trinh vo nghiem";
                }
            }
        }
    }
}
