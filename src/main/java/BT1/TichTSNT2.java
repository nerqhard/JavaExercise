// Bài 3: Phân tích một số nguyên thành tích lũy thừa của thừa số nguyên tố
package BT1;

public class TichTSNT2 {
    public String tichTSTN2(int a) {
        int i, somu;
        StringBuffer kq = new StringBuffer();
        if (a <= 1) {
            kq.append("So vua nhap khong phai so nguyen!!!");
            return kq.toString();
        }
        for (i=2; i <= a; i++) {
            somu = 0;
            while (a%i == 0) {
                somu += 1;
                a /= i;
            }
            if (somu >=1) {
                if (somu == 1) {
                    kq.append(i);
                }
                else {
                    kq.append(i).append("^").append(somu);
                }
                if (a > i) {
                    kq.append(" * ");
                }
            }

        }
        return kq.toString();
    }
}
