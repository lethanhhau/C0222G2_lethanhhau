package module2.ss19_string_and_regex.bai_tap.ss2_validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String REGEX_PHONENUMBER = "^\\(+\\d{2}\\)-\\([0]+\\d{9}\\)$";

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Phone Number: ");
            String input = scanner.nextLine();
            Pattern pattern = Pattern.compile(REGEX_PHONENUMBER);
            Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.matches());
            if (matcher.matches()){
                break;
            }
        }
    }
}
