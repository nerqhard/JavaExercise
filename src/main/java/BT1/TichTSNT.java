// Bài 2.1: Phân tích một số nguyên thành tích của thừa số nguyên tố
package BT1;
import java.util.Scanner;
public class TichTSNT {
    public static void main(String[] arsg) {
        int a, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên: ");
        a = scanner.nextInt();
    // Kiểm tra số nguyên tố
        while (a <= 1) {
        System.out.println("Hãy nhập lại 1 số nguyên lớn hơn 1: ");
        a = scanner.nextInt();
    }
    // Phân tích
        System.out.print("Kết quả: ");
        for (i=2; i <= a; i++) {
            while (a%i == 0) {
                System.out.print(i);
                a /= i;
                if (a > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }

}
