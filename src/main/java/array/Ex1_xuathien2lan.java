package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1_xuathien2lan {

    public List<Integer> xh_hon_2_lan(int[] a) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(a);
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            }
            if (((a[i] != a[i - 1]) && (count > 1)) || ((i == (a.length - 1)) && (count > 1))) {
                result.add(a[i - 1]);
                count = 0;
            }
        }
        return result;
    }
}