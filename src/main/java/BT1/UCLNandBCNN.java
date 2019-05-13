// Bài 1. Tìm ước chung lớn nhất và bội chung nhỏ nhất của  2 số tự nhiên
package BT1;
public class UCLNandBCNN {
    public int UCLN(int a, int b) {
        int tam1, tam2;
        tam1 = a;
        tam2 = b;
        while (tam1 != tam2) {
            if (tam1 > tam2) {
                tam1 -= tam2;
            }
            else {
                tam2 -= tam1;
            }
        }
        return tam1;
    }
    public int BCNN(int a, int b) {
        int tam1, tam2;
        tam1 = a;
        tam2 = b;
        while (tam1 != tam2) {
            if (tam1 > tam2) {
                tam1 -= tam2;
            }
            else {
                tam2 -= tam1;
            }
        }
        return (a*b/tam1);
    }
}
