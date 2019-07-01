package string;

public class Ex13_Kiem_tra_giong_nhau {
    public boolean kt_giong_nhau(String str1, String str2) {
        while (str1.length() * str2.length() != 0) {
            if (str2.contains(str1.charAt(0) + "")) {
                str2 = str2.replace(str1.charAt(0) + "", "").trim();
            }
            str1 = str1.replace(str1.charAt(0) + "", "").trim();
        }
        return str1.isEmpty() && str2.isEmpty();
    }
}
