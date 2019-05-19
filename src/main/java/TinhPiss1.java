public class TinhPiss1 {

    public double tinhpiss1 () {
        int n = 1;
        double pi = 4;
        double s;
        do {
            s = 4.0/(n*2 + 1);
            pi += Math.pow(-1,n)*s;
            n ++;
        } while (s >= 0.0001);
        return pi;
    }
}
