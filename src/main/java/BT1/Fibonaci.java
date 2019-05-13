// Bài 4: Danh sách những số Fibonaci không lớn hơn số cho trước 1 1 2 3 5 8 ...
package BT1;
import java.util.Scanner;
public class Fibonaci {
    public String Fibonaci(int n) {
        int tam;
        int f1 = 1;
        int f2 = 1;
        StringBuffer str = new StringBuffer();
        while (f1 <= n) {
            str.append(f1);
            tam = f2;
            f2 += f1;
            f1 = tam;
            if (f1<=n) {
                str.append(" ");
            }
        }
    return str.toString();
    }
}
