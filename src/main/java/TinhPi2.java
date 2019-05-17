public class TinhPi2 {

    public double tinhpi2() {
        double pi = 3;
        double x;
        int  n = 1;
        do {
            x = 4.0 /(2 * n * (2 * n+1) * (2 * n + 2));
            if (n % 2 == 0) {
                pi -= x;
            } else {
                pi += x;
            }
            n ++;
        } while (x >= 0.00001);
        return pi;
    }
}
