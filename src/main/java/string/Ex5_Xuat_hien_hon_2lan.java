package string;

public class Ex5_Xuat_hien_hon_2lan {
    public String xh_2lan(String str) {
        StringBuilder result = new StringBuilder();
        String[] temp = str.split("[ ]");
        for (int i = 0; i < temp.length; i++) {
            int count = 0;
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i].equals(temp[j])) {
                    count++;
                }
                if ((count == 2)&&(!result.toString().contains(temp[i]))) {
                    result.append(temp[i]).append(", ");
                    break;
                }
            }
        }
        return result.substring(0, result.length() - 2);
    }
}
