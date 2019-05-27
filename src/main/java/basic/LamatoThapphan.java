package basic;

import java.util.HashMap;

public class LamatoThapphan {

    public int lama_to_thapphan(String str) {
        str = str.toUpperCase();
        int kq = 0;
        int pre = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('X', 10);
        hm.put('C', 100);
        hm.put('M', 1000);
        hm.put('V', 5);
        hm.put('L', 50);
        hm.put('D', 500);
        for (int i = (str.length() - 1); i >= 0; i--) {
            int temp = hm.get(str.charAt(i));
            if (temp < pre) {
                kq -= temp;
            } else {
                kq += temp;
            }
            pre = temp;
        }
        return kq;
    }
}
