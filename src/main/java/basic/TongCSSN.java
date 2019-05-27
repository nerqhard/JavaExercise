// Bài 2. Tổng các chữ số của một số nguyên
package basic;

public class TongCSSN {

    public int tcssn(int a) {
        int tong = 0;
        while (a > 0) {
            tong += a%10;
            a /= 10;
        }
        return tong;
    }
}
