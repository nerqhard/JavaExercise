package array;

public class Ex3_Chan_tru_le {
    public int chan_tr_le(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (1 - 2 * (a[i] % 2)) * a[i];
        }
        return sum;
    }
}
