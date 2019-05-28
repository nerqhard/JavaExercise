package array;

import java.util.Arrays;

public class Ex2_Sum3max {
    public int tong_3_so_max(int[] a) {
        Arrays.sort(a);
        int len = a.length;
        return a[len - 1] + a[len - 2] + a[len - 3];
    }
}
