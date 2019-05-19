public class TongFibonacci {

    public int tongfibo(int n) {
        int f1 = 0;
        int f2 = 1;
        int s = 0;
        int count = 1;
        while (count <= n) {
            int temp = f2;
            s += f2;
            f2 += f1;
            f1 = temp;
            count++;
        }
        return s;
    }
}