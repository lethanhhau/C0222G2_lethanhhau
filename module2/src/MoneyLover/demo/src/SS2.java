import java.util.Scanner;

public class SS2 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = scanner.nextInt();
        int arr[] = new int[n];
        int a = 1;
        int b = 0;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = a;
            a = a + b;
            b = c;
        }
        System.out.println("Số thứ " + n + " trong dãy Fibonacci là số : " + c);
    }
}
