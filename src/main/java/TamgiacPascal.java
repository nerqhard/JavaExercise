
public class TamgiacPascal {

    public int[] tgpascal(int n) {
        int[] array = new int[n + 1];
        array[0] = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j >= (i + 1) / 2; j--) {
                array[j] += array[j - 1];
            }
            for (int j = 1; j < (i + 1) / 2; j++) {
                array[j] = array[i - j];
            }
        }
        return array;
    }
}
