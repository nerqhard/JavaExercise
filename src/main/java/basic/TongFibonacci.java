package basic;

public class TongFibonacci {

    public int tongfibo(int n) {
        int f1 = 0;
        int f2 = 1;
        int sum = 0;
        for (int count = 1; count <= n; count++) {
            int temp = f2;
            sum += f2;
            f2 += f1;
            f1 = temp;
        }
        return sum;
    }
}