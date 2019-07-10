package string;

public class Ex16_CalculateSum {
    public String calSum(String a, String b) {
        StringBuilder result = new StringBuilder();
        if (a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int n = b.length() - a.length();
        int soDu = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            if ((i - n) >= 0) {
                int temp = b.charAt(i) - '0' + a.charAt(i - n) - '0';
                result.insert(0, (temp + soDu) % 10);
                soDu = (temp + soDu) / 10;
            } else {
                result.insert(0, (b.charAt(i) - '0' + soDu) % 10);
                soDu = (b.charAt(i) - '0' + soDu) / 10;
            }
        }
        if (soDu == 1) {
            result.insert(0, 1);
        }
        return result.toString();
    }
}
