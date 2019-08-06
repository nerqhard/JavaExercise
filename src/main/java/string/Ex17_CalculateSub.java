package string;

public class Ex17_CalculateSub {
    public boolean isSmaller(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        return (a.compareTo(b) < 0);
    }

    private int numberFromRight(String str, int i) {
        if (i >= str.length()) {
            return 0;
        }
        return str.charAt(str.length() - 1 - i) - '0';
    }

    public String calSub(String a, String b) {
        if (isSmaller(a, b)) {
            return "-" + calSub(b, a);
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < a.length(); i++) {
            int sub = (numberFromRight(a, i) - numberFromRight(b, i) - carry);
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            } else
                carry = 0;
            sb.append(sub);
        }
        while (sb.charAt(sb.length() - 1) == '0') {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.reverse().toString();
    }
}
