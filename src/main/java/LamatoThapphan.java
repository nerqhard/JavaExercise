public class LamatoThapphan {

    public int lama_to_thapphan(String str) {
        String s = str.toUpperCase();
        int len = s.length();
        s += " ";
        int kq = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            char nch = s.charAt(i + 1);
            switch (ch) {
                case 'M':
                    kq += 1000;
                    break;
                case 'C':
                    if (nch == 'M') {
                        kq += 900;
                        i++;
                    } else {
                        if (nch == 'D') {
                            kq += 400;
                            i++;
                        } else {
                            kq += 100;
                        }
                    }
                    break;
                case 'D':
                    kq += 500;
                    break;
                case 'X':
                    if (nch == 'C') {
                        kq += 90;
                        i++;
                    } else {
                        if (nch == 'L') {
                            kq += 40;
                            i++;
                        } else {
                            kq += 10;
                        }
                    }
                    break;
                case 'L':
                    kq += 50;
                    break;
                case 'V':
                    kq += 5;
                    break;
                case 'I':
                    if (nch == 'X') {
                        kq += 9;
                        i++;
                    } else {
                        if (nch == 'V') {
                            kq += 4;
                            i++;
                        } else {
                            kq += 1;
                        }
                    }
                    break;
            }
        }
        return kq;
    }
}
