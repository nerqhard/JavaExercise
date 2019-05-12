// Bài 1. Tìm ước chung lớn nhất và bội chung nhỏ nhất của  2 số tự nhiên
package BT1;
public class UCLNandBCNN {
    public int UCLN(int a, int b) {
        int tam1, tam2;
        tam1 = a;
        tam2 = b;
        while (tam1 != tam2) {
            if (tam1 > tam2) {
                tam1 -= tam2;
            }
            else {
                tam2 -= tam1;
            }
        }
        return tam1;
    }
    public int BCNN(int a, int b) {
        int tam1, tam2;
        tam1 = a;
        tam2 = b;
        while (tam1 != tam2) {
            if (tam1 > tam2) {
                tam1 -= tam2;
            }
            else {
                tam2 -= tam1;
            }
        }
        return (a*b/tam1);
    }
}
/*
    import java.util.Scanner; // Nhập Scanner từ gói java,util
    public class UCLNandBCNN {
      public static void main(String[] args) {
            int so1, so2, tam1, tam2, uscln;
            Scanner scanner = new   Scanner(System.in); // Tạo đối tượng scanner để sử dụng
        // Nhập 2 số vào
            System.out.println("Nhập 2 số nguyên dương");
            System.out.println("Nhập số thứ 1: ");
            so1 =   scanner.nextInt(); /// gán giá trị int nhập vào cho so1
            System.out.println("Nhập số thứ 2: ");
            so2 =   scanner.nextInt(); /// gán giá trị int nhập vào cho so2
        // Kiểm tra 2 số vừa nhập vào
            while ((so1<=0) || (so2<=0)) {
                System.out.println("Số vừa nhập không phải là số nguyên dương");
                if (so1 <= 0) {
                    System.out.println("Nhập lại số thứ 1: ");
                    so1 = scanner.nextInt();
                }
                if (so2 <= 0) {
                    System.out.println("Nhập lại số thứ 2: ");
                    so2 = scanner.nextInt();
                }
            }
        // Tìm USCLN
            tam1 = so1;
            tam2 = so2;
            while (tam1 != tam2) {
                if (tam1 < tam2) {
                    tam2 -= tam1;
                }
                else {
                    tam1 -= tam2;
                    }
            }

            uscln = tam1;
            System.out.println("Ước số chung lớn nhất của " + so1 + " và "+ so2 + " là: " + uscln);
            System.out.println("Bội số chung lớn nhất của " + so1 + " và "+ so2 + " là: " + (so1*so2/uscln));
        }
}
*/