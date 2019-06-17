package array;

import java.util.Arrays;

public class Ex27_Mang_somax {
    public int[] mang_max(int[] a, int n) {
        int[] result = new int[n];
        int id = 0;
        Arrays.sort(a);
        for (int i = a.length - 1; i >= a.length - n; i--) {
            result[id] = a[i];
            id++;
        }
        return result;
    }
}
