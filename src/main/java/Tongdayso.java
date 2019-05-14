
public class Tongdayso {

    public int tdso(int n) {
        int tong = 0;
        int s1 = 1;

        while (n >= s1) {
            tong += s1*(s1+1);
            s1++;
        }
        return tong;
    }
}
