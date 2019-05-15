public class TinhBieuthuc {

    public static long giaithua(int a) {
        long gt = 1;
        for (int i = 1; i<=a; i++) {
            gt *= i;
        }
        return gt;
    }
    public double bthuc(int n){
        double s = 1;
        for (int j = 1; j <= n; j++) {
            s += 1.0/giaithua(j);
        }
        return s;
    }
}
