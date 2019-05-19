
public class TamgiacPascal {

    public int[] tgpascal(int n) {
        int[] array = new int[n + 1];
        array[0] = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= (i + 1) / 2; j--) {
                array[j] += array[j - 1];
            }
            for (int j = 1; j < (i + 1) / 2; j++) {
                array[j] = array[i - j];
            }
        }
        return array;
    }

}

    /*
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
     */

