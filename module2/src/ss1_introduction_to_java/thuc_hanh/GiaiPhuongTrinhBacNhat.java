package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args){
        float a,b;
        Scanner scanner =new  Scanner(System.in);
        System.out.print("nhập a: ");
        a = scanner.nextFloat();
        System.out.print("nhập b: ");
        b = scanner.nextFloat();
        if (a != 0){
            float answer = -b/a;
            System.out.println("phương trình có 1 nghiệm là: "+ answer);
        }else{
            if (b==0){
                System.out.println("phương trình vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}
