package basic;

public class Fibothoaman {

    public int fibo_thoaman(int m, int n) {
        int a = 0;
        int b = 1;
        int count = 0;
        while (b <= n) {
            int temp = a;
            a = b;
            b += temp;
            if (a >= m) {
                count++;
            }
        }
        return count;
    }
}
