package string;

public class Ex1_Liet_ke {
    public String[] liet_ke_str(String str) {
        String[] result = str.split("[.,?,!,\n]+");
        return result;
    }
}
