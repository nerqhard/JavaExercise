package array;

import java.util.ArrayList;
import java.util.List;

public class Ex7_Day_lien_tiep {

    public List<Integer> arr_lien_tiep(int[] a) {
        int count = 0;
        int n = 0;
        int dau = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                count++;
                if (count > n) {
                    n = count;
                    dau = i + 1 - count;
                }
            } else {
                count = 0;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = dau; i <= (dau + n); i++) {
            result.add(a[i]);
        }
        return result;
    }
}
