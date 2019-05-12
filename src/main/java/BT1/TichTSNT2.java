// Bài 3: Phân tích một số nguyên thành tích lũy thừa của thừa số nguyên tố
package BT1;
import java.util.Scanner;
public class TichTSNT2 {
    public static void main(String[] arsg) {
        int a, i, n, somu;
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
            somu = 0;
            while (a%i == 0) {
                somu += 1;
                a /= i;
            }
            if (somu >=1) {
                if (somu == 1) {
                    System.out.print(i);
                }
                else {
                    System.out.print(i + "^" + somu);
                }
                if (a > i) {
                    System.out.print(" * ");

                }
            }

        }
    }
}
