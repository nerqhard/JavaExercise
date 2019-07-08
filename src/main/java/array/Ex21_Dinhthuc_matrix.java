package array;

public class Ex21_Dinhthuc_matrix {
    public double[][] minor(double[][] a, int i) {
        double[][] minor = new double[a.length - 1][a[0].length - 1];
        for (int j = 1; j < a.length; j++) {
            for (int k = 0; k < a[0].length; k++) {
                if (k < i) {
                    minor[j - 1][k] = a[j][k];
                } else {
                    if (k > i) {
                        minor[j - 1][k - 1] = a[j][k];
                    }
                }
            }
        }
        return minor;
    }

    public double det_matrix(double[][] a) {
        if (a.length == 1) {
            return a[0][0];
        } else {
            double result = 0;
            for (int i = 0; i < a[0].length; i++) {
                result += (1 - i % 2 * 2) * a[0][i] * det_matrix(minor(a, i));
            }
            return result;
        }
    }
}
