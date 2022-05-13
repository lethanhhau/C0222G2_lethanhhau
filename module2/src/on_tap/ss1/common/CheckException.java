package on_tap.ss1.common;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CheckException {
    public static Scanner scanner = new Scanner(System.in);
    private final static String PATTERN = "dd/MM/yyyy";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
    public static int checkInt(int value) {
        boolean check = true;
        while (check) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println();
                System.out.print("Enter again: ");
                check = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return value;
    }
}
