public class Tinhe {

    public static long giaithua(int a) {
        long gt = 1;
        for (int i = 1; i<=a; i++) {
            gt *= i;
        }
        return gt;
    }
    public double tinhe(){
        double s = 1;
        int j = 1;
        do {
            s += 1.0/giaithua(j);
            j ++;
        } while (s >= 0.00001);
        return s;
    }
}

