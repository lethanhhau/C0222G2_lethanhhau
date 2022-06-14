package furama.com.validate;

public class Validate {
    private static final String REGEX_CMND = "^([0-9]{9})||([0-9]{12})$";
    private static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static final String REGEX_NUMBER = "^(([1-9]+)||([1-9][0-9]+))$";
    private static final String REGEX_PHONE = "^((09)|(\\(84\\)\\+9))[0-1][0-9]{7}$";
    private static final String REGEX_NAME = "^[A-Z][a-z0-9]+||([A-Z][a-z0-9]+(\\ [A-Z][a-z0-9]+)+)$";
    private static final String REGEX_TEST_DATE = "^((([1-9])|([1-2][0-9])|([3][0-1]))/(([1-9])|([1][0-2])))/(([1][9][2-9]{2})|([2][0][0][1-4]))$";

    public static boolean isDate(String date){
        if (!date.matches(REGEX_TEST_DATE)){
            return true;
        }return false;
    }

    public static boolean isName(String name){
        if (!name.matches(REGEX_NAME)){
            return true;
        }return false;
    }

    public static Boolean isPhone(String phone){
        if(!phone.matches(REGEX_PHONE)){
            return true;
        }return false;
    }

    public static Boolean isCmnd(String cmnd){
        if (!cmnd.matches(REGEX_CMND)){
            return true;
        }return false;
    }

    public static Boolean isEmail(String email){
        if (!email.matches(REGEX_EMAIL)){
            return true;
        }return false;
    }

    public static Boolean isNumber(String number){
        if (!number.matches(REGEX_NUMBER)){
            return true;
        }return false;
    }
}
