// Bài 3: Phân tích một số nguyên thành tích lũy thừa của thừa số nguyên tố
package bt1;

public class TichTSNT2 {

    public String tichtstn2(int a) {
        StringBuffer kq = new StringBuffer();
        if (a <= 1) {
            return "So vua nhap khong phai so nguyen!!!";
        }
        for (int i=2; i <= a; i++) {
            int somu = 0;
            while (a%i == 0) {
                somu += 1;
                a /= i;
            }
            if (somu >=1) {
                kq.append(i);
                if (somu > 1) {
                    kq.append("^").append(somu);
                }
                if (a > i) {
                    kq.append(" * ");
                }
            }
        }
        return kq.toString();
    }
}
