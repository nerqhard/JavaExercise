package array;

public class Ex24_BCNN_UCLN {

    public int ucln(int a, int b) {
        if ((a == 0)||(b == 0)) {
            return 0;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        return a;
    }

    public int bcnn(int a, int b) {
        if (ucln(a,b) == 0) {
            return 0;
        } else {
            return a*b/ucln(a,b);
        }
    }

    public int bcnn_arr(int[] a) {
        int temp = bcnn(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            temp = bcnn(temp, a[i]);
        }
        return temp;
    }

    public int ucln_arr(int[] a) {
        int temp = ucln(a[0], a[1]);
        for (int i = 2; i < a.length; i++) {
            temp = ucln(temp, a[i]);
        }
        return temp;
    }
}
