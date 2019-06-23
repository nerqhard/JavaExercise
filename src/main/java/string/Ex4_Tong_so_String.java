package string;

public class Ex4_Tong_so_String {
    public int sum_num(String str) {
        int sum = 0;
        str = str.replaceAll("\\D+", " ").trim();
        String[] temp = str.split(" ");
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
