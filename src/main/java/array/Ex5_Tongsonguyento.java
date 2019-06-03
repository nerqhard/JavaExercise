package array;

public class Ex5_Tongsonguyento {
    public static boolean nguyento(int n) {
        if (n < 2) {
            return false;
        }
        int cbh = (int) Math.sqrt(n);
        for (int i = 2; i < cbh; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int tong_so_nto(int[] a) {
        int sum = 0;
        for (Integer i : a) {
            if (nguyento(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
