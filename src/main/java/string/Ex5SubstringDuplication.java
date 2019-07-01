package string;

import java.util.ArrayList;

public class Ex5SubstringDuplication {

    public String[] findDuplicated(String str) {

        ArrayList<String> result = new ArrayList<>();

        String[] words = str.split("[ ]");

        for (int i = 0; i < words.length; i++) {
            int count = 0;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if ((count == 2)) {
                result.add(words[i]);
            }
        }

        return result.toArray(new String[0]);
    }

}
