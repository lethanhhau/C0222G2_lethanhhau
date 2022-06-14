package common;

public class CheckValidate {
    private static final String REGEX_CMND = "^([0-9]{9})||([0-9]{12})$";
    private static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String REGEX_DATE = "^((([1-9])|([1-2][0-9])|([3][0-1]))/(([1-9])|([1][0-2])))/(([1][9][2-9]{2})|([2][0][0][1-4]))$";
    private static final String REGEX_NUMBER = "^(([1-9]+)||([1-9][0-9]+))$";
    private static final String REGEX_PHONE = "^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$";


    public static Boolean isPhone(String phone){
        return phone.matches(REGEX_PHONE);
    }

    public static Boolean isCmnd(String name){
        return name.matches(REGEX_CMND);
    }

    public static Boolean isEmail(String name){
        return name.matches(REGEX_EMAIL);
    }

    public static Boolean isDate(String name){
        return name.matches(REGEX_DATE);
    }

    public static Boolean isNumber(String name){
        return name.matches(REGEX_NUMBER);
    }
}
