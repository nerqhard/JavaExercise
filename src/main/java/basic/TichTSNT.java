// Bài 2.1: Phân tích một số nguyên thành tích của thừa số nguyên tố
package basic;

public class TichTSNT {

    public String tichtstn(int a) {
        StringBuffer kq = new StringBuffer();
        if (a <= 1) {
            return "So vua nhap khong phai so nguyen!!!";
        }
        for (int i=2; i <= a; i++) {
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
