package array;

public class Ex13_Xoaymang2chieu {
    public int[][] xoay_mang_2c(int[][] a) {

        int[][] result = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            int column = 0;
            for (int j = a.length - 1; j >= 0; j--) {
                result[i][column] = a[j][i];
                column++;
            }
        }
        return result;
    }
}
