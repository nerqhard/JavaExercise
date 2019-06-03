package array;


public class Ex4_sapxepchanle {

    public int[] sx_chanle(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % 2 == 1 && a[j] % 2 == 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                if (((a[i] + a[j]) % 2 == 0) && ((a[i] > a[j]) == (a[i] % 2 < 1))) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
