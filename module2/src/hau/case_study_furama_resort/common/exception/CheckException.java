package hau.case_study_furama_resort.common.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckException {
    private static Scanner scanner = new Scanner(System.in);
    private final static String PATTERN = "dd/MM/yyyy";
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(PATTERN);
    private static Date now = new Date();
    private final static Long AGE_18_MILISECOND = 567648000000L;
    private final static Long AGE_100_MILISECOND = 3153600000000L;

    /**
     * check exception Int.
     */
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

    /**
     * check Exception double
     */
    public static double checkDouble(double value) {
        boolean check = true;
        while (check) {
            try {
                value = Double.parseDouble(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println();
                System.out.print("enter again: ");
                check = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return value;
    }

    /**
     * Check exception Long
     */
    public static long checkLong(long value) {
        boolean check = true;
        while (check) {
            try {
                value = Long.parseLong(scanner.nextLine());
                check = false;
            } catch (NumberFormatException e) {
                System.err.println("Error: " + e.getMessage());
                System.out.println();
                System.out.print("enter again: ");
                check = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return value;
    }

    public static Date checkDayofbirth(Date value){
        boolean check = true;
        while (check){
            try {
                value = dateFormat.parse(scanner.nextLine());
                CheckDateException(value);
                check = false;
            } catch (ParseException e) {
                System.out.println("Error: "+e.getMessage());
                System.out.println();
                System.out.println("Enter day of birth again! (dd-MM-yyyy): ");
            }catch (DateOfBirthException e){
                System.err.println(e.getMessage());
                System.out.println();
                System.out.print("Enter day of birth again! (dd-MM-yyyy): ");
            }
        }
        return value;
    }

    public static void CheckDateException(Date date) throws DateOfBirthException {
        if ((now.getTime() - date.getTime() < AGE_18_MILISECOND) || (now.getTime() - date.getTime() > AGE_100_MILISECOND)) {
            throw new DateOfBirthException("Day of birth illegal");
        }
    }
}
