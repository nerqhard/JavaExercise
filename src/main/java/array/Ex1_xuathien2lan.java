package array;

import java.util.ArrayList;
import java.util.List;

public class Ex1_xuathien2lan {

    public List<Integer> xh_hon_2_lan(int[] a) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
                if ((count > 1) && (!result.contains(a[i]))) {
                    result.add(a[i]);
                }
            }
        }
        return result;
    }
}