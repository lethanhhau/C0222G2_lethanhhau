package hau.case_study_furama_resort.common.validate;

public class ValidateFacility {
    private static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]{1,}$";
    private static final String REGEX_ACREAGE = "^[3-9]{2,}\\.[0-9]{1,}$";
    public static Boolean isMatchesServiceName(String serviceName){
        return serviceName.matches(REGEX_SERVICE_NAME);
    }
    public static Boolean isMatchesAcrege(String acrege){
        return acrege.matches(REGEX_ACREAGE);
    }
}
