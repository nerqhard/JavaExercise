package string;

public class Ex17_CalculateSub {
    public boolean isSmaller(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() < b.length();
        }
        return (a.compareTo(b) < 0);
    }

    public String calSub(String a, String b) {
        String neg = "";
        if (isSmaller(a, b)) {
            String temp = a;
            a = b;
            b = temp;
            neg = "-";
        }
        StringBuilder str = new StringBuilder();
        int n1 = a.length();
        int n2 = b.length();
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int carry = 0;
        for (int i = 0; i < n2; i++) {
            int sub = ((a.charAt(i) - '0') - (b.charAt(i) - '0') - carry);
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            } else
                carry = 0;
            str.append(sub);
        }
        for (int i = n2; i < n1; i++) {
            int sub = (a.charAt(i) - '0' - carry);
            if (sub < 0) {
                sub = sub + 10;
                carry = 1;
            } else
                carry = 0;
            str.append(sub);
        }
        while (str.charAt(str.length() - 1) == '0') {
            str.delete(str.length() - 1, str.length());
        }
        return (str.reverse()).insert(0,neg).toString();
    }
}
