package array;

public class Ex26_Daoso_array {

    public int dao_so(int n) {
        int result = 0;
        int temp;
        while (n > 0) {
            temp = n % 10;
            result = result * 10 + temp;
            n /= 10;
        }
        return result;
    }

    public int daoso_array(int[] a) {
        int sum = 0;
        for (int i : a) {
            i = dao_so(i);
            sum += i;
        }
        return sum;
    }
}
