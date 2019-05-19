public class TamgiacPascal {
    public static int combine(int n, int k) {
        if (k > n) {
            return 0;
        } else {
            if (k == 0 || k == n) {
                return 1;
            } else {
                return (combine(n - 1, k) + combine(n - 1, k - 1));
            }
        }
    }
    public String tgpascal(int n) {
        StringBuffer kq = new StringBuffer();
        for (int i = 0; i < n; i++) {
                kq.append(combine(n - 1, i) + " ");
        }
        return kq.toString().trim();
    }
}
