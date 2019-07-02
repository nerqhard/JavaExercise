package string;

public class Ex14_IsBarcodeEan13 {
    public boolean isBarcode(String str) {
        str = str.replaceAll(" ", "");
        if (str.length() != 13) {
            return false;
        }
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i & 1) == 0) {
                evenNum += str.charAt(i);
            } else {
                oddNum += str.charAt(i);
            }
        }
        return ((oddNum * 3 + evenNum) % 10 == 0);
    }
}
