package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args){
        float with;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter with: ");
        with = scanner.nextFloat();//nhập chiều rộng.
        System.out.print("Enter height: ");
        height = scanner.nextFloat();//nhập chiều rộng.
        float area = with * height;
        System.out.println("Diện tích hình chữ nhật = "+ area);
    }
}
