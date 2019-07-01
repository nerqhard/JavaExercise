package string;

public class Ex11_Cal_String {
    public double cal_string(String str) {
        str = str.replace(" ", "");
        String[] num = str.split("[^0-9]+");
        String cal = str.replaceAll("[0-9]", "");
        double result = 0;
        switch (cal) {
            case "+":
                result = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
                break;
            case "-":
                result = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
                break;
            case "*":
                result = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
                break;
            case "/":
                result = 1.0 * Integer.parseInt(num[0]) / Integer.parseInt(num[1]);
                break;
            case "^":
                result = Math.pow(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
                break;
            case "<<":
                result = Integer.parseInt(num[0]) << Integer.parseInt(num[1]);
                break;
            case ">>":
                result = Integer.parseInt(num[0]) >> Integer.parseInt(num[1]);
                break;
        }
        return result;
    }
}
