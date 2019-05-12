// Bài 4: Danh sách những số Fibonaci không lớn hơn số cho trước 1 1 2 3 5 8 ...
package BT1;
import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] arsg) {
        int n, tam;
        int f1 = 1;
        int f2 = 1;
        Scanner scanner = new Scanner(System.in);
        // Nhập số nguyên
        System.out.println("Nhập vào số nguyên: ");
        n = scanner.nextInt();
        while (f1 <= n) {
            System.out.print(f1+" ");
            tam = f2;
            f2 += f1;
            f1 = tam;
        }
    }
}
