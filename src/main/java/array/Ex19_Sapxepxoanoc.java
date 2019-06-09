package array;

import java.util.Arrays;

public class Ex19_Sapxepxoanoc {
    public int[][] sxep_xoanoc(int[][] a) {

        int[] temp = new int[a.length * a[0].length];
        int id = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                temp[id] = a[i][j];
                id++;
            }
        }
        Arrays.sort(temp);
        int top = 0;
        int bot = a.length - 1;
        int left = 0;
        int right = a[0].length - 1;
        int flow = 1;
        id = 0;
        while (top <= bot && left <= right) {
            if (flow == 1) {
                for (int i = left; i <= right; i++) {
                    a[top][i] = temp[id];
                    id++;
                }
                top++;
                flow = 2;
            } else {
                if (flow == 2) {
                    for (int i = top; i <= bot; i++) {
                        a[i][right] = temp[id];
                        id++;
                    }
                    right--;
                    flow = 3;
                } else {
                    if (flow == 3) {
                        for (int i = right; i >= left; i--) {
                            a[bot][i] = temp[id];
                            id++;
                        }
                        bot--;
                        flow = 4;
                    } else {
                        for (int i = bot; i >= top; i--) {
                            a[i][left] = temp[id];
                            id++;
                        }
                        left++;
                        flow = 1;
                    }
                }
            }
        }
        return a;
    }
}
