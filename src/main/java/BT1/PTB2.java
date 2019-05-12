package BT1;
import java.util.Scanner;
public class PTB2 {
    public static void main(String[] args) {
        float a, b, c, delta;
        float x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2: Ax^2 + Bx + C = 0 \nNhập giá trị A: ");
        a = scanner.nextFloat();
        System.out.println("Nhập giá trị B: ");
        b = scanner.nextFloat();
        System.out.println("Nhập giá trị C: ");
        c = scanner.nextFloat();
    // Kiem tra gia tri a
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                }
                else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            else {
                System.out.println("Phương trình có 1 nghiệm: x = "+ (-c/b));
            }
        }
        else {
            delta = b * b - 2 * a * c;
            if (delta > 0) {
                x1 = (float) (-b + Math.sqrt(delta)) / 2 / a;
                x2 = (float)(-b - Math.sqrt(delta)) / 2 / a;
                System.out.println("Phương trình có 2 nghiệm: x1 = " + x1 + " và x2 = " + x2);
            } else {
                if (delta == 0) {
                    x1 = (-b / 2 / a);
                    System.out.println("Phương trình có 1 nghiệm kép: x1 = x2 = " + x1);
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }
}
