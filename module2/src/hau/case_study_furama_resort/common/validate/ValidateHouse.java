package hau.case_study_furama_resort.common.validate;

public class ValidateHouse {
    private static final String REGEX_SERVICE_CODE = "^SVHO\\-[0-9]{4}$";
    public static Boolean isMatchesServiceCode(String serviceCode){
        return serviceCode.matches(REGEX_SERVICE_CODE);
    }

}
