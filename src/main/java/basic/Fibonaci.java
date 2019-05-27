// Bài 4: Danh sách những số Fibonaci không lớn hơn số cho trước 1 1 2 3 5 8 ...
package basic;

public class Fibonaci {

    public String fibonaci(int n) {
        int f1 = 1;
        int f2 = 1;
        if (n <= 0) {
            return "So nhap khong phai so nguyen";
        }
        StringBuffer str = new StringBuffer();
        while (f1 <= n) {
            str.append(f1);
            int temp = f2;
            f2 += f1;
            f1 = temp;
            if (f1<=n) {
                str.append(" ");
            }
        }
        return str.toString();
    }
}
