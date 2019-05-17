public class DaoSoNhiPhan {

    public int daoso(int n) {
        int bin[] = new int[30];
        int a = 0;
        int s = 0;
        while (n > 0) {
            bin[a] = n % 2;
            n /= 2;
            a++;
        }
        for (int i = 0; i < a; i++) {
            s +=  bin[a - i - 1] * Math.pow(2, i);
        }
        return s;
    }
}
