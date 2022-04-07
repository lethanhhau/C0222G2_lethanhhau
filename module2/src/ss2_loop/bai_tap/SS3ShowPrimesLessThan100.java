package ss2_loop.bai_tap;
//Hiển thị các số nguyên tố nhỏ hơn 100.
public class SS3ShowPrimesLessThan100 {
    public static void main(String[] args) {
        String number = "";
        for (int i = 2; i < 100; i++) {
            int count =0;
            for (int j = i; j >=1; j--) {
                if (i % j == 0) {
                    count += 1 ;
                }

                }
            if (count == 2) {
                System.out.println(number + i + " ");
            }
        }

    }
}
