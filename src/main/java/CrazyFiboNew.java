import java.util.Arrays;

public class CrazyFiboNew {
    public int crazyfibonew(long n, int a0, int a1, int a2, int a3, int a4) {
        int array[] = {a0, a1, a2, a3, a4};
        int[] fa = new int[5];
        for (int i = 0; i <= 4; i++) {
            fa[i] = array[i];
        }
        long count = 4;
        while (count < n) {
            int sum = 0;
            for (int i = 0; i <= 4; i++) {
                sum += array[i];
                if (i != 4) {
                    array[i] = array[i + 1];
                } else {
                    array[i] = sum % 10;
                }
            }
            if (Arrays.equals(array, fa)) {
                n %= (count-3);
                count = 4;
            } else {
                count++;
            }
        }
        return (n > 4) ? array[4] : array[(int) n];
    }
}
