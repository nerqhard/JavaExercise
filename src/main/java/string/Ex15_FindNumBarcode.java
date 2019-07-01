package string;

public class Ex15_FindNumBarcode {
    public int findBarcode(String str) {
        str = str.replaceAll(" ", "");
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((i & 1) == 0) {
                evenNum += str.charAt(i);
            } else {
                oddNum += str.charAt(i);
            }
        }
        if ((evenNum * 3 + oddNum) % 10 != 0) {
            return 10 - (evenNum * 3 + oddNum) % 10;
        }
        return 0;
    }
}
