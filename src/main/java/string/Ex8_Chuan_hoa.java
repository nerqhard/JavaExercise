package string;

public class Ex8_Chuan_hoa {
    public String chuan_hoa(String str) {
        String[] sub = str.replaceAll("[^.?!]+", " ").trim().split(" ");
        String[] temp = str.replaceAll("[ ]+", " ").split("[.?!]+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            temp[i] = temp[i].trim();
            if (i == temp.length - 1) {
                result.append(String.valueOf(temp[i].charAt(0)).toUpperCase()).append((temp[i].substring(1)).toLowerCase());
            } else {
                result.append(String.valueOf(temp[i].charAt(0)).toUpperCase()).append(temp[i].substring(1).toLowerCase()).append(sub[i]).append(" ");
            }
        }
        String[] sub2 = result.toString().replaceAll("[^,]+", " ").trim().split(" ");
        String[] temp2 = result.toString().replaceAll("[ ]+", " ").split("[,]+");

        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = temp2[i].trim();
            if (i == temp2.length - 1) {
                result2.append(temp2[i]);
            } else {
                result2.append(temp2[i]).append(sub2[i]).append(" ");
            }
        }
        return result2.toString();
    }
}
