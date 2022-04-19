package module2.ss11_stack_and_queue.bai_tap.ss2_count_appearances_of_every_word_use_map;

import java.util.Map;
import java.util.TreeMap;

public class CountAppearancesOfEveryWord {
    public static void main(String[] args) {
        String str = "abcDefabcFQzclAcFa";
        str = str.toUpperCase();

        Map<Character, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!treeMap.containsKey(str.charAt(i))) {
                treeMap.put(str.charAt(i), 1);
            } else {
                treeMap.put(str.charAt(i), (treeMap.get(str.charAt(i))+1));
            }
        }
        for (Map.Entry<Character,Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
