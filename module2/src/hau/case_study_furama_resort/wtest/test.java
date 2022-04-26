package hau.case_study_furama_resort.wtest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    private static Scanner scanner = new Scanner(System.in);
    private static final String REGEX_MA_DICH_VU = "^SV+[VL|HO|RO]-[0-9]{4}$";
    private static final String REGEX_TEN_DICH_VU = "^[A-Z]+[a-z] $";
    private static final String DIEN_TICH = "^ $";

    public static void maDichVu() {

        System.out.print("Nhập Mã Dịch Vụ: ");
        String maDichVu = scanner.nextLine();
        Pattern pattern = Pattern.compile(REGEX_MA_DICH_VU);
        Matcher matcher = pattern.matcher(maDichVu);
        System.out.println(matcher.matches());
    }

    public static void tenDichVu() {
        System.out.print("Nhập Tên Dịch Vụ: ");
        String tenDichVu = scanner.nextLine();
        Pattern pattern = Pattern.compile(REGEX_TEN_DICH_VU);
        Matcher matcher = pattern.matcher(tenDichVu);
        System.out.println(matcher.matches());
    }

    public static void main(String[] args) {
            maDichVu();
            tenDichVu();
    }
}
