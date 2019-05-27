package basic;

public class Toadotgiac {


    private double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public String tdtgiac(double x1, double y1, double x2, double y2, double x3, double y3) {

        double a = getLength(x1, y1, x2, y2);
        double b = getLength(x1, y1, x3, y3);
        double c = getLength(x2, y2, x3, y3);

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double p = (a + b + c) / 2;

            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                return String.format("Tam giac vuong. Dien tich: %.2f. Chu vi: %.2f", s, 2 * p);
            } else {
                if ((a == b) || (b == c) || (a == c)) {
                    return String.format("Tam giac can. Dien tich: %.2f. Chu vi: %.2f", s, 2 * p);
                } else {
                    if ((a == b) && (b == c)) {
                        return String.format("Tam giac deu. Dien tich: %.2f. Chu vi: %.2f", s, 2 * p);
                    } else {
                        return String.format("Tam giac thuong. Dien tich: %.2f. Chu vi: %.2f", s, 2 * p);
                    }
                }
            }
        } else {
            return "Tam giac khong ton tai!!!";
        }
    }
}