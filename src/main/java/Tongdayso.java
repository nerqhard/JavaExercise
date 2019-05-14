/*
*Nguyễn Quang Hà
*Bài 6: Nhập n và in ra tổng dãy số như yêu cầu. (Giả sử đề bài cho n là số nguyên)
 */
public class Tongdayso {
    public int TDSo(int n) {
        int tong = 0;
        int s1 = 1;
        int s2 = 2;

        while (n >= s1) {
            tong += s1*s2;
            s1 = s2;
            s2++;
        }
        return tong;
    }
}
