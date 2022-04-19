package module2.ss3_array_and_method.thuc_hanh;
//Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức;

public class SS5FindTheSmallestValue {
    public static void main(String[] args) {
        int[] arr= {2,8,6,1,4,6};
        int index = minValue(arr);
        System.out.print("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int[]arr){
        int index = 0;
        for (int i = 1;i<arr.length;i++){
            if (arr[i]<arr[index]){
                index = i;
            }
        }
     return index;
    }
}
