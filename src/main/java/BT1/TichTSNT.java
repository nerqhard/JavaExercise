// Bài 2.1: Phân tích một số nguyên thành tích của thừa số nguyên tố
package BT1;

public class TichTSNT {
    public String TichTSNT(int a) {
        int i;
        StringBuffer kq = new StringBuffer();
    // Kiểm tra số nguyên tố
        if (a <= 1) {
            kq.append("So vua nhap khong phai so nguyen!!!");
            return kq.toString();
        }
    // Phân tích
        for (i=2; i <= a; i++) {
            while (a%i == 0) {
                kq.append(i);
                a /= i;
                if (a > 1) {
                    kq.append(" * ");
                }
            }
        }
    return kq.toString();
    }

}
