package array;

public class Ex20_Tach_mang2c {
    public int[][] tach_mang(int[][] a, int x, int y, int b, int n) {
        int[][] result = new int[b][n];
        int row = 0;

        if (((x + b) > a.length) || ((y + n) > a[0].length)) {
            return new int[][]{};
        }

        for (int i = x; i < x + b; i++) {
            int column = 0;
            for (int j = y; j < y + n; j++) {
                result[row][column] = a[i][j];
                column++;
            }
            row++;
        }
        return result;
    }
}
