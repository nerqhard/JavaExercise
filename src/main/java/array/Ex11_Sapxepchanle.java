package array;

public class Ex11_Sapxepchanle {
    public int[] sap_xep_chan_le(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (((a[i] + a[j]) % 2) == 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
