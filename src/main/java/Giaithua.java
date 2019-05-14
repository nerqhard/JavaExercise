public class Giaithua {
    public long giaithua(int n) {
        long gt = 1;
        int i = 1;
        while (i<=n) {
            gt *= i;
            i ++;
        }
    return gt;
    }
}
