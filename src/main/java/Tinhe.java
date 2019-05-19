public class Tinhe {

    public double tinhe(){
        double s = 1;
        int i = 1;
        double x = 1;
        do {
            x /= i;
            s += x;
            i ++;
        } while (x >= 0.00001);
        return s;
    }
}

