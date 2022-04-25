package module2.ss16_text_tile.thuc_hanh.ss2_find_the_maximum_value;

import java.util.List;

public class FindMaxValue {
    private final static String NUMBER = "src/module2/ss16_text_tile/thuc_hanh/ss2_find_the_maximum_value/numbers.csv";
    private final static String RESULT = "src/module2/ss16_text_tile/thuc_hanh/ss2_find_the_maximum_value/Result.csv";
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(NUMBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(RESULT, maxValue);
    }
}
