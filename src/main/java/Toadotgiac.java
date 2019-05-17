public class Toadotgiac {

    public String tdtgiac(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a;
        double b;
        double c;
        a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double x = (a + b + c) / 2;
            double s = Math.sqrt(x * (x - a) * (x - b) * (x - c));
            if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
                return String.format("Tam giac vuong. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
            } else {
                if ((a == b) || (b == c) || (a == c)) {
                    return String.format("Tam giac can. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
                } else {
                    if ((a == b) && (b == c)) {
                        return String.format("Tam giac deu. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
                    } else {
                        return String.format("Tam giac thuong. Dien tich: %.2f. Chu vi: %.2f", s, 2 * x);
                    }
                }
            }
        } else {
            return "Tam giac khong ton tai!!!";
        }
    }
}