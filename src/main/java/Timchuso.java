public class Timchuso {

    public static int demcs(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count ++;
        }
        return count;
    }
    public static int valid (int n) {
        int s = 0;
        int m = demcs(n);
        int a = n % 10;
        int b = n;
        while (b > 0){
            s += Math.pow(a, m);
            b /= 10;
            a = b % 10;
        }
        return s;
    }
    public String timcso() {
        StringBuffer kq = new StringBuffer();
        for (int i = 10; i <= 99999; i++) {
            if (valid(i) == i) {
                    kq.append(i + " ");
            }
        }
        return kq.toString().trim();
    }
}
