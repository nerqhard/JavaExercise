
public class Tongdayso {

    public int tdso(int n) {
        int tong = 0;
        for (int s1 = 1; s1 <= n; s1++) {
            tong += s1*(s1+1);
        }
        return tong;
    }
}
