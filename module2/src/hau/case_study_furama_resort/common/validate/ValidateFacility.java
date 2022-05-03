package hau.case_study_furama_resort.common.validate;

public class ValidateFacility {
    private static final String REGEX_SERVICE_NAME = "^[A-Z][a-z]+$";
    private static final String REGEX_ACREAGE = "^(([3-9][0-9])|([1-9][0-9]{2,}))\\.[0-9]+$";
    private static final String REGEX_RENTAL_COSTS = "^[1-9][0-9]+$";
    private static final String REGEX_NUMBER_OF_FLOORS = "^(([1-9])|([1-9][0-9]+))$";
    private static final String REGEX_MAXIMUM_PERSON = "^(([1-9])|([1][0-9]))$";

    private static final String REGEX_TEST = "^((([1-9])|([1-2][0-9])|([3][0-1]))/(([1-9])|([1][0-2])))/(([1][9][2-9]{2})|([2][0][0][1-4]))$";

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
        return maximumPerson.matches(REGEX_TEST);
    }
}
