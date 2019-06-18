package array;

public class Ex23_SumElement {
    public int sum_elements(int[] a) {
        int sum = 0;
        int temp = 0;
        for (int i : a) {
            if (i >= 0) {
                temp += i;
            } else {
                temp = 0;
            }
            if (temp > sum) {
                sum = temp;
            }
        }
        return sum;
    }
}
