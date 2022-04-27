package hau.case_study_furama_resort.common.validate;

public class ValidateVila {
    private static final String REGEX_SERVICE_CODE = "^SVVL\\-[0-9]{4}$";
    public static Boolean isMatchesServiceCodeVila(String serviceCode){
        return serviceCode.matches(REGEX_SERVICE_CODE);
    }
}
