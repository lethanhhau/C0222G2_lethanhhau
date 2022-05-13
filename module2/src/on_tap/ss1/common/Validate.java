package on_tap.ss1.common;

public class Validate {
    public static final String REGEX_MA_CHIEU_PHIM = "^CI\\-[0-9]{4}$";

    public static boolean isMaChieuPhim(String maChieuPhim){
        return maChieuPhim.matches(REGEX_MA_CHIEU_PHIM);
    }
}
