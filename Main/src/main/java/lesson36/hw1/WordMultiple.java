package lesson36.hw1;
import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> resultMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String[] words1 = {"мама", "мыла", "раму", "мама", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};

        Map<String, Boolean> result1 = wordMultiple(words1);
        Map<String, Boolean> result2 = wordMultiple(words2);
        Map<String, Boolean> result3 = wordMultiple(words3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}