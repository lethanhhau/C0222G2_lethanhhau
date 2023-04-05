public class SS1 {

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {13,2,3,17,4,5,10,7,8,9};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }  if (isPrimeNumber(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }

}
