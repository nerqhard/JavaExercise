public class Timchuso {

    public static int demcs(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count ++;
        }
        return count;
    }
    public String timcso() {
        StringBuffer kq = new StringBuffer();
        for (int i = 10; i <= 99999; i++) {
            int s = 0;
            int m = demcs(i);
            int a = i % 10;
            int b = i;
            while (b > 0){
                s += Math.pow(a, m);
                b /= 10;
                a = b % 10;
            }
            if (s == i) {
                if (kq.length() == 0) {
                    kq.append(i);
                } else {
                    kq.append(" " + i);
                }
            }
        }
        return kq.toString();
    }
}
