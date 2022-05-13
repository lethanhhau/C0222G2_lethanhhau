package hau.case_study_furama_resort.common.validate;

public class Validate {
    private static final String REGEX_SERVICE_HOUSE = "^SVHO\\-[0-9]{4}$";
    private static final String REGEX_SERVICE_ROOM = "^SVRO\\-[0-9]{4}$";
    private static final String REGEX_SERVICE_VILA = "^SVVL\\-[0-9]{4}$";
    private static final String REGEX_SERVICE_NAME = "^[A-Z][a-z0-9 ]+$";
    private static final String REGEX_ACREAGE = "^(([3-9][0-9])|([1-9][0-9]{2,}))(\\.[0-9]+)?$";
    private static final String REGEX_RENTAL_COSTS = "^[1-9][0-9]+$";
    private static final String REGEX_NUMBER_OF_FLOORS = "^(([1-9])|([1-9][0-9]+))$";
    private static final String REGEX_MAXIMUM_PERSON = "^(([1-9])|([1][0-9]))$";
    private static final String REGEX_EMAIL = "^[a-z0-9]+@gmail.com$";
    private static final String REGEX_PHONE = "^[1-9]{2}[0-9]{8}$";
    /**
     * Regex test date
     */
    private static final String REGEX_TEST_DATE = "^((([1-9])|([1-2][0-9])|([3][0-1]))/(([1-9])|([1][0-2])))/(([1][9][2-9]{2})|([2][0][0][1-4]))$";
    private static final String REGEX_NAME = "^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+( [A-Z][a-z0-9]+)+))$";

    public static Boolean isName(String name){
        return name.matches(REGEX_NAME);
    }

    public static Boolean isEmail(String email){ return email.matches(REGEX_EMAIL);}

    public static Boolean isPhone(String phone){ return  phone.matches(REGEX_PHONE);}

    public static Boolean isMatchesServiceCodeHouse(String serviceCode){
        return serviceCode.matches(REGEX_SERVICE_HOUSE);
    }

    public static Boolean isMatchesServiceCodeRoom
            (String serviceCode){
        return serviceCode.matches(REGEX_SERVICE_ROOM);
    }

    public static Boolean isMatchesServiceCodeVila(String serviceCode){
        return serviceCode.matches(REGEX_SERVICE_VILA);
    }

    public static Boolean isMatchesServiceName(String serviceName) {
        return serviceName.matches(REGEX_SERVICE_NAME);
    }

    public static Boolean isMatchesAcrege(String acrege) {
        return acrege.matches(REGEX_ACREAGE);
    }

    public static Boolean isMatchesRentalCosts(String rentalCosts) {
        return rentalCosts.matches(REGEX_RENTAL_COSTS);
    }

    public static Boolean isMatchesNumberOfFloors(String numberOfFloors) {
        return numberOfFloors.matches(REGEX_NUMBER_OF_FLOORS);
    }

    public static Boolean isMatchesMaximumPerson(String maximumPerson) {
        return maximumPerson.matches(REGEX_MAXIMUM_PERSON);
    }

    public static Boolean isTest(String maximumPerson) {
        return maximumPerson.matches(REGEX_TEST_DATE);
    }


}
