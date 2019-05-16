package bt1;

public class TinhCanbachai {

    public double tinhcan(int n) {
        double x = (n+1) / 2;
        double delta;
        do {
            double kq = x;
            x = 0.5 * (x + n / x);
            delta = x - kq;
            if (delta < 0) {
                delta = - delta;
            }
        } while (delta >= 0.0001);
        return x;
    }
}
