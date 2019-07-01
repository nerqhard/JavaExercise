package string;

public class Ex10_Phan_tich {
    public String phan_tich(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                StringBuilder dem = new StringBuilder();
                int j = i;
                while (Character.isDigit(str.charAt(j))) {
                    dem.append(str.charAt(j));
                    j++;
                }
                for (int k = 1; k < Integer.parseInt(dem.toString()); k++) {
                    result.append(str.charAt(i - 1));
                }
                i = j - 1;
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
