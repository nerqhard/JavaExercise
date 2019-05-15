public class TinhPiss1 {

    public double tinhpiss1 () {
        int n = 0;
        double pi = 0;
        double s;
        do {
            s = 1.0/(n*2 + 1);
            pi += Math.pow(-1,n)*s;
            n ++;
        } while (s > 0.00001);
        return pi*4;
    }
}
