package string;

public class Ex6_Chuyen_kieu_chu {
    public String cover_word(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result.append(String.valueOf(str.charAt(i)).toLowerCase());
            } else {
                result.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }
        return result.toString();
    }
}
