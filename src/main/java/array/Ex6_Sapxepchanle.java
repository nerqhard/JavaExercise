package array;

public class Ex6_Sapxepchanle {

    public int[] sortarr(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if ((a[i] + a[j]) % 2 == 0) {
                    if (((a[i] % 2 == 0) && (a[i] < a[j])) || ((a[i] % 2 == 1) && (a[i] > a[j]))) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }
}
