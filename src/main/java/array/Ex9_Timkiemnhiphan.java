package array;

public class Ex9_Timkiemnhiphan {
    public int tim_nhi_phan(int[] a, int input) {
        int dau = 0;
        int cuoi = a.length - 1;
        while (dau <= cuoi) {
            int temp = (dau + cuoi) / 2;
            if (a[temp] == input) {
                return temp;
            } else {
                if (a[temp] < input) {
                    dau = temp + 1;
                } else {
                    cuoi = temp - 1;
                }
            }
        }
        return -1;
    }
}
