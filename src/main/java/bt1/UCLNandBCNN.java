// Bài 1. Tìm ước chung lớn nhất và bội chung nhỏ nhất của  2 số tự nhiên
package bt1;

public class UCLNandBCNN {

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
}
