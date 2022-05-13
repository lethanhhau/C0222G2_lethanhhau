package bai_thi.common;

public class Validate {
    private static final String REGEX_NAME = "^(([A-Z][a-z0-9]+)|([A-Z][a-z0-9]+( [A-Z][a-z0-9]+)+))$";


    public static Boolean isName(String name){
        return name.matches(REGEX_NAME);
    }

}
