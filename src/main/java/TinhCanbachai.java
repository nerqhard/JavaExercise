public class TinhCanbachai {

    public double tinhcan(int n) {
        double x = (n+1) / 2;
        double kq;
        do {
            kq = x;
            x = 0.5 * (x + n / x);
        } while (Math.abs((x - kq) ) >= 0.0001);
        return x;
    }
}
