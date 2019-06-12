package array;

public class Ex22_Del_RowCol {
    public double[][] del_rowcol(double[][] a, int x, int y) {
        double[][] result = new double[a.length - 1][a[0].length - 1];
        if ((x > (a.length - 1)) || (y > (a[0].length - 1))) {
            return a;
        }
        int row = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == x) {
                continue;
            }
            int col = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (j == y) {
                    continue;
                }
                result[row][col] = a[i][j];
                col++;
            }
            row++;
        }
        return result;
    }
}
