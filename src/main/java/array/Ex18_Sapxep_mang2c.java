package array;

import java.util.Arrays;

public class Ex18_Sapxep_mang2c {
    public int[][] sapxep_2c(int[][] a) {
        int[] temp = new int[a.length * (a[0].length)];
        int id = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                temp[id] = a[i][j];
                id++;
            }
        }
        Arrays.sort(temp);
        id = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = a[0].length - 1; j >= 0; j--) {
                a[i][j] = temp[id];
                id++;
            }
        }
        return a;
    }
}
