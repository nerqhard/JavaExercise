package array;

public class Ex5_Tongsonguyento {
    public static boolean nguyento(int n) {
        if (n < 2) {
            return false;
        } else {
            if (n > 2) {
                if (n % 2 == 0) {
                    return false;
                } else {
                    for (int i = 3; i < (float) Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public int tong_so_nto(int []a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (nguyento(a[i])) {
                sum += a[i];
            }
        }
        return sum;
    }
}
