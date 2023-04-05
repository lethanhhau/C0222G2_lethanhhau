import java.util.*;

class SS3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] A = {1, 2, 3};
        countPairs(A, n);
    }

    public static void countPairs(int[] A, int n) {
        List<List<Integer>> pairs = new ArrayList<>();
        generatePairs(A, new ArrayList<>(), pairs, n, 0);
        System.out.println("Số cặp không trùng nhau là: " + pairs.size());
        System.out.print("Danh sách các cặp không trùng nhau là: ");
        for (List<Integer> pair : pairs) {
            for (Integer pairNumber : pair) {
                System.out.print(pairNumber);
            }
            System.out.print(" ");
        }
    }

    public static void generatePairs(int[] A, List<Integer> current, List<List<Integer>> pairs, int n, int start) {
        if (current.size() == n) {
            pairs.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < A.length; i++) {
            current.add(A[i]);
            generatePairs(A, current, pairs, n, i + 1);
            current.remove(current.size() - 1);
        }
    }
}