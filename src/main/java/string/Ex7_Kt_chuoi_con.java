package string;

public class Ex7_Kt_chuoi_con {
    public int check_sub_str(String str, String text) {
        int id = 0;
        for (int i = 0; i < str.length(); i++) {
            while ((id < text.length()) && (str.charAt(i) == text.charAt(id))) {
                id++;
            }
            if (id == text.length()) {
                return i - id + 1;
            }
        }
        return -1;
    }
}

