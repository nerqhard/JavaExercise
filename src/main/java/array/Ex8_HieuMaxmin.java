package array;

import java.util.Arrays;

public class Ex8_HieuMaxmin {
    public int sub_max_min(int[] a) {
        Arrays.sort(a);
        return a[a.length - 1] - a[0];
    }
}
