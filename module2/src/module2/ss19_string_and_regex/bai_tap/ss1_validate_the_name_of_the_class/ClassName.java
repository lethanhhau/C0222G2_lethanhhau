package module2.ss19_string_and_regex.bai_tap.ss1_validate_the_name_of_the_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_CLASSNAME = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        while (true){
        Pattern pattern = Pattern.compile(REGEX_CLASSNAME);
            System.out.print("Enter Class Name: ");
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.matches());
            if (matcher.matches()) {
                break;
            }

        }
    }
}


