public class DaoSoNhiPhan {

    public int daoso(int n) {
        int s = 0;
        while (n > 0) {
            s = s * 2 + n % 2;
            n /= 2;
        }
        return s;
    }
}
