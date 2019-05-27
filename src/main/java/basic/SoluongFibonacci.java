package basic;

public class SoluongFibonacci {
    public int sofibonacci(int n) {
        int a = 0;
        int b = 1;
        int count = 0;
        while (b <= n) {
            int temp = a;
            a = b;
            b += temp;
            count++;
        }
        return count;
    }
}
