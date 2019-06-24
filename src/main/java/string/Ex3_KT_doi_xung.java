package string;

public class Ex3_KT_doi_xung {
    public boolean str_mirror(String str) {
        String temp = new StringBuffer(str).reverse().toString();
        return str.equals(temp);
    }
}