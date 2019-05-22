public class CrazyFibonacci {
    public int crazyfibo(int a0, int a1, int a2, int a3, int a4, int n) {
        Integer array[] = {a0, a1, a2, a3, a4};
        int count = 4;
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
            count++;
        }
        return (n > 4) ? array[4] : array[n];
    }
}
