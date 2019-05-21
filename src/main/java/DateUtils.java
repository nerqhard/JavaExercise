import java.sql.Struct;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUtils {

    public boolean nam_thoa_man(int year) {
        return ((year >= 1900) && (year <= 3000));
    }

    public boolean thang_thoa_man(int month) {
        return ((month >= 1) && (month <= 12));
    }

    public boolean ngay_thoa_man(int day, int ofmonth) {
        return ((day > 0) && (day <= ofmonth));
    }

    public boolean kt_nam_nhuan(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public int so_ngay_cua_nam(int year) {
        if (kt_nam_nhuan(year) == true) {
            return 366;
        } else {
            return 365;
        }
    }

    public int so_ngay_cua_thang(int month, int year) {
        int[] ngay_theo_thang = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = ngay_theo_thang[month - 1];
        return ((month == 2) && (kt_nam_nhuan(year))) ? (days + 1) : days;
    }

    public Date chuyen_string_to_date(String input, SimpleDateFormat df) {
        Date ngay = null;
        try {
            ngay = df.parse(input);
        } catch (ParseException e) {

        }
        return ngay;
    }

    public int gan_ngay(String inp) {
        String[] date = inp.split("[/]");
        return Integer.valueOf(date[0]);
    }

    public int gan_thang(String inp) {
        String[] date = inp.split("[/]");
        return Integer.valueOf(date[1]);
    }

    public int gan_nam(String inp) {
        String[] date = inp.split("[/]");
        return Integer.valueOf(date[2]);
    }

    public boolean ddmmyy_thoa_man(String inp, SimpleDateFormat sdf) {
        if (chuyen_string_to_date(inp, sdf) != null) {
            int day = gan_ngay(inp);
            int month = gan_thang(inp);
            int year = gan_nam(inp);
            if (nam_thoa_man(year)) {
                if (thang_thoa_man(month)) {
                    return ngay_thoa_man(day, so_ngay_cua_thang(month, year));
                }
            }
        }
        return false;
    }

    public int ngay_da_qua_tu_1900(int year) {
        int days = 0;
        for (int i = 1900; i < year; i++) {
            days += so_ngay_cua_nam(i);
        }
        return days;
    }

    public int ngay_da_qua_trong_nam(int day, int month, int year) {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += so_ngay_cua_thang(i, year);
        }
        return days + day;
    }

    public int so_ngay_con_lai_thang(String inpdate) {
        int days;
        SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
        if (ddmmyy_thoa_man(inpdate, sf)) {
            int day = gan_ngay(inpdate);
            int month = gan_thang(inpdate);
            int year = gan_nam(inpdate);
            days = so_ngay_cua_thang(month, year) - day;
        } else {
            throw new RuntimeException("Invalid date");
        }
        return days;
    }

    public int so_ngay_con_lai_nam(String inpdate) {
        int days;
        SimpleDateFormat sfd = new SimpleDateFormat("dd/mm/yyyy");
        if (ddmmyy_thoa_man(inpdate, sfd)) {
            int day = gan_ngay(inpdate);
            int month = gan_thang(inpdate);
            int year = gan_nam(inpdate);
            days = so_ngay_cua_nam(year) - ngay_da_qua_trong_nam(day, month, year);
        } else {
            throw new RuntimeException("Invalid date");
        }
        return days;
    }

    public String thu_trong_ngay(String inp) {
        String[] dayweek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int countday;
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        if (ddmmyy_thoa_man(inp, df)) {
            int day = gan_ngay(inp);
            int month = gan_thang(inp);
            int year = gan_nam(inp);
            countday = ngay_da_qua_tu_1900(year) + ngay_da_qua_trong_nam(day, month, year);
        } else {
            throw new RuntimeException("Invalid date");
        }
        return dayweek[countday % 7];
    }
}
