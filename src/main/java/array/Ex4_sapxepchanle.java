package array;

import java.util.ArrayList;
import java.util.Collections;

public class Ex4_sapxepchanle {

    public ArrayList<Integer> sx_chanle(int[] a) {
        ArrayList<Integer> chan = new ArrayList<>();
        ArrayList<Integer> le = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                chan.add(a[i]);
            } else {
                le.add(a[i]);
            }
        }
        Collections.sort(chan);
        Collections.sort(le);
        Collections.reverse(le);
        chan.addAll(le);
        return chan;
    }
}
