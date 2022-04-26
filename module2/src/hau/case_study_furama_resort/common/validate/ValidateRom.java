package hau.case_study_furama_resort.common.validate;

public class ValidateRom {
    private static final String REGEX_SERVICE_CODE = "^SVRO\\-[0-9]{4}$";
    public static Boolean isMatchesServiceCode(String serviceCode){
        return serviceCode.matches(REGEX_SERVICE_CODE);
    }
}
