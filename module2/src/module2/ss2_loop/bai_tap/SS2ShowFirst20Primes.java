package module2.ss2_loop.bai_tap;
//Hiển thị 20 số nguyên tố đầu tiên.

public class SS2ShowFirst20Primes {
    public static void main(String[] args) {
        byte number = 20;
        byte count = 0;
        byte n = 2;
        count += 1;
        while (count < number) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}
