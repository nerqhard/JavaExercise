package string;

public class Ex9_Rut_gon {
    public String rut_gon(String str) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                continue;
            }
            if (count > 1) {
                result.append(str.charAt(i)).append(count);
            } else {
                result.append(str.charAt(i));
            }
            count = 1;
        }
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) {
            result.append(str.charAt(str.length() - 1));
        }
        return result.toString();
    }
}
