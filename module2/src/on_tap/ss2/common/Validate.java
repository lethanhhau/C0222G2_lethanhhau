package on_tap.ss2.common;

public class Validate {
    public static final String REGEX_MA_MON_HOC = "^BC\\-[A-z]{4}$";
    public static final String REGEX_PHIEN_BAN = "^[0-9]\\.[0-9]$";
    private static final String REGEX_TEN_MON_HOC = "^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+( [A-Z][a-z0-9]+)+))$";

    public static boolean isMaMonHoc(String maMonHoc){
        return maMonHoc.matches(REGEX_MA_MON_HOC);
    }
    public static boolean isPhienBan(String phienBan){
        return phienBan.matches(REGEX_PHIEN_BAN);
    }
    public static boolean isTenMonHoc(String tenMonHoc){
        return tenMonHoc.matches(REGEX_TEN_MON_HOC);
    }
}
