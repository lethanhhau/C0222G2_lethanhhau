package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;
//Ứng dụng đọc số thành chữ.

public class Bai2ReadNumbersIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số cần đọc: ");
        String number = sc.nextLine();

        int temp = Integer.parseInt(number);
        number = temp + "";

        String[] arrNumber = number.split("");

        if (Integer.parseInt(number) < 10) {
            if (number.equals("0")) {
                System.out.println("Zero");
            } else {
                System.out.println(lessThanTen(number));
            }
        } else if (Integer.parseInt(number) < 100) {
            System.out.println(greaterThanTen(arrNumber[0], lessThanTen(arrNumber[1])));
        } else if (Integer.parseInt(number) < 1000) {
            System.out.println(greaterThanOneHundred(arrNumber[0], arrNumber[1], lessThanTen(arrNumber[2])));
        }

    }

    public static String lessThanTen(String number1) {
        switch (number1) {
            case "0":
                return "";
            case "1":
                return "One";
            case "2":
                return "Two";
            case "3":
                return "Three";
            case "4":
                return "Four";
            case "5":
                return "Five";
            case "6":
                return "Six";
            case "7":
                return "Seven";
            case "8":
                return "Eight";
            case "9":
                return "Nine";
            default:
                return "Out of ability";
        }
    }

    public static String greaterThanTen(String number, String number1) {
        switch (number) {
            case "1":
                switch (number1) {
                    case "":
                        return "Ten";
                    case "One":
                        return "Eleven";
                    case "Two":
                        return "Twelve";
                    case "Three":
                        return "Thirteen";
                    case "Five":
                        return "Fifteen";
                    default:
                        return number1 + "teen";
                }
            case "2":
                switch (number1) {
                    case "":
                        return "Twenty";
                    default:
                        return "Twenty-" + number1.toLowerCase();
                }
            case "3":
                switch (number1) {
                    case "":
                        return "Thirty";
                    default:
                        return "Thirty-" + number1.toLowerCase();
                }
            case "4":
                switch (number1) {
                    case "":
                        return "forty";
                    default:
                        return "forty-" + number1.toLowerCase();
                }
            case "5":
                switch (number1) {
                    case "":
                        return "Fifty";
                    default:
                        return "Fifty-" + number1.toLowerCase();
                }
            case "6":
                switch (number1) {
                    case "":
                        return "sixty";
                    default:
                        return "sixty-" + number1.toLowerCase();
                }
            case "7":
                switch (number1) {
                    case "":
                        return "seventy";
                    default:
                        return "seventy-" + number1.toLowerCase();
                }
            case "8":
                switch (number1) {
                    case "":
                        return "eighty";
                    default:
                        return "eighty-" + number1.toLowerCase();
                }
            case "9":
                switch (number1) {
                    case "":
                        return "ninety";
                    default:
                        return "ninety-" + number1.toLowerCase();
                }
            default:
                return "";
        }
    }

    public static String greaterThanOneHundred(String number, String number2, String number3) {
        switch (number) {
            default:
                switch (number2) {
                    case "":
                        switch (number3) {
                            case "":
                                return lessThanTen(number) + " hundress";
                        }
                    default:
                        switch (number2) {
                            case "0":
                                return lessThanTen(number) + " hundress and " + number2.toLowerCase();
                            default:
                                return lessThanTen(number) + " hundress and " + greaterThanTen(number2, number3).toLowerCase();
                        }
                }
        }
    }
}




