package array;

public class Ex21_Dinhthuc_matrix {
    public double det_matrix(double[][] a) {
        double temp[][];
        double result = 0;

        if (a.length == 1) {
            result = a[0][0];
            return result;
        }

        if (a.length == 2) {
            result = a[0][0] * a[1][1] - a[0][1] * a[1][0];
            return result;
        }

        for (int i = 0; i < a[0].length; i++) {
            temp = new double[a.length - 1][a[0].length - 1];
            for (int j = 1; j < a.length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if (k < i) {
                        temp[j - 1][k] = a[j][k];
                    } else {
                        if (k > i) {
                            temp[j - 1][k - 1] = a[j][k];
                        }
                    }
                }
            }
            result += a[0][i] * Math.pow(-1, (double) i) * det_matrix(temp);
        }
        return result;
    }
}
