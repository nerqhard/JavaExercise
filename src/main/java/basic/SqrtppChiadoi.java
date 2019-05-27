package basic;

public class SqrtppChiadoi {

    public double cbh_chiadoi(double n) {
        double temp;
        double kq = n / 2;
        do {
            temp = kq;
            kq = (temp + (n / temp)) / 2;
        } while ((temp - kq) != 0);
        return kq;
    }
}
