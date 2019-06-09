package array;

public class Ex17_Matran_xoanoc {
    public int[][] mtran_xoanoc(int n) {
        int[][] result = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bot = n - 1;
        int flow = 1;
        int val = 1;

        while ((top <= bot) && (left <= right)) {
            if (flow == 1) {
                for (int i = left; i <= right; i++) {
                    result[top][i] = val;
                    val++;
                }
                top++;
                flow = 2;
            } else {
                if (flow == 2) {
                    for (int i = top; i <= bot; i++) {
                        result[i][right] = val;
                        val++;
                    }
                    right--;
                    flow = 3;
                } else {
                    if (flow == 3) {
                        for (int i = right; i >= left; i--) {
                            result[bot][i] = val;
                            val++;
                        }
                        bot--;
                        flow = 4;
                    } else {
                        for (int i = bot; i >= top; i--) {
                            result[i][left] = val;
                            val++;
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
