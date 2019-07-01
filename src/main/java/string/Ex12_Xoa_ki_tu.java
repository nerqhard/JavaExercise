package string;

public class Ex12_Xoa_ki_tu {
    public String del_char(String str) {
        str += " ";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
