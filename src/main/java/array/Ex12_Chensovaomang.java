package array;

import java.util.Arrays;

public class Ex12_Chensovaomang {
    public int[] chen_so(int[] a, int n) {
        Arrays.sort(a);
        int[] result = new int[a.length + 1];
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= n) {
                result[i] = a[i];
                dem = i + 1;
            }
        }
        result[dem] = n;
        for (int i = dem + 1; i < a.length + 1; i++) {
            result[i] = a[i - 1];
        }
        return result;
    }
}
