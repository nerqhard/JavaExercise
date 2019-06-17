package string;

public class Ex2_Tach_tu {
    public String liet_ke_tu(String str) {
        String result = "";
        String[] temp = str.split("[ ]+");
        for (String i : temp) {
            if (i.matches("[a-zA-z0-9]+")) {
                result += i + ", ";
            }
        }
        return result.substring(0, result.length() - 2);
    }
}
