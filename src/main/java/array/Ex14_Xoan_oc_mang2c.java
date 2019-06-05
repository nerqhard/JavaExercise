package array;

public class Ex14_Xoan_oc_mang2c {
    public int[] xoan_oc_mang2c(int[][] a) {
        int[] result = new int[a.length * a[0].length];
        int left = 0;
        int top = 0;
        int right = a[0].length - 1;
        int bot = a.length - 1;
        int flow = 1;
        int id = 0;

        while ((top <= bot) && (left <= right)) {
            if (flow == 1) {
                for (int i = left; i <= right; i++) {
                    result[id] = a[top][i];
                    id++;
                }
                top++;
                flow = 2;
            } else {
                if (flow == 2) {
                    for (int i = top; i <= bot; i++) {
                        result[id] = a[i][right];
                        id++;
                    }
                    right--;
                    flow = 3;
                } else {
                    if (flow == 3) {
                        for (int i = right; i >= left; i--) {
                            result[id] = a[bot][i];
                            id++;
                        }
                        bot--;
                        flow = 4;
                    } else {
                        for (int i = bot; i >= top; i--) {
                            result[id] = a[i][left];
                            id++;
                        }
                        left++;
                        flow = 1;
                    }
                }
            }
        }
        return result;
    }
}
