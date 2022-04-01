package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần đọc: ");
        String number = scanner.nextLine();
        if (Integer.parseInt(number) <= 10){
            System.out.print(letNhoHonMuoi(number));
        }
        else if (Integer.parseInt(number)<=20){
            System.out.print(letNhoHonHaiMuoi(number));
        }

    }

    public static String letNhoHonMuoi(String number) {
        switch (number) {
            case "0":
                return "";
            case "1":
                return "một";
            case "2":
                return "hai";
            case "3":
                return "ba";
            case "4":
                return "bốn";
            case "5":
                return "năm";
            case "6":
                return "sáu";
            case "7":
                return "bảy";
            case "8":
                return "tám";
            case "9":
                return "chín";
            default:
                return "mười";
        }
    }

    public static String letNhoHonHaiMuoi(String number) {
        switch (number) {
            case "11":
                return letNhoHonMuoi(number) + "một";
            case "12":
                return letNhoHonMuoi(number) + "hai";
            case "13":
                return letNhoHonMuoi(number) + "ba";
            case "14":
                return letNhoHonMuoi(number) + "bốn";
            case "15":
                return letNhoHonMuoi(number) + "năm";
            case "16":
                return letNhoHonMuoi(number) + "sáu";
            case "17":
                return letNhoHonMuoi(number) + "bảy";
            case "18":
                return letNhoHonMuoi(number) + "tám";
            case "19":
                return letNhoHonMuoi(number) + "chín";
            default:
                return "";
        }
    }
}




