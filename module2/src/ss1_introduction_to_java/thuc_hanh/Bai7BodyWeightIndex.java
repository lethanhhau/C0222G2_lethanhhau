package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;
//Tính chỉ số cân nặng của cơ thể.

public class Bai7BodyWeightIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập cân nặng: ");
        float wiegth = scanner.nextFloat();
        System.out.print("nhập chiều cao: ");
        float heigth = scanner.nextFloat();
        float bmi = wiegth / (heigth * heigth);
        System.out.printf("%-20s%s", "bmi", "tình trạng:\n");
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "thiếu cân");
        }
        else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, " bình thường");
        }
        else if (bmi < 30){
            System.out.printf("%-20.2f%s", bmi," thừa cân");
        }else {
            System.out.printf("%-20.2f%s", bmi," béo phì");
        }
    }
}
