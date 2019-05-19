public class TinhBieuthuc {

    public double bieuthuc(int n){
        double s = 1;
        double x = 1;
        for (int i = 1; i <= n; i++) {
            x /= i;
            s += x;
        }
        return s;
    }
}
