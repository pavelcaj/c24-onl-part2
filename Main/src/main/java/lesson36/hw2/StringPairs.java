package lesson36.hw2;
import java.util.HashMap;
import java.util.Map;

public class StringPairs {

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();

        for (String str : strings) {
            if (!str.isEmpty()) {
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
                resultMap.put(String.valueOf(firstChar), String.valueOf(lastChar));
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {
        String[] strings1 = {"code", "bug"};
        String[] strings2 = {"man", "moon", "main"};
        String[] strings3 = {"man", "moon", "good", "night"};

        Map<String, String> result1 = pairs(strings1);
        Map<String, String> result2 = pairs(strings2);
        Map<String, String> result3 = pairs(strings3);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}