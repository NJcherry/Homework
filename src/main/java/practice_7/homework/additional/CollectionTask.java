package practice_7.homework.additional;

import java.util.HashMap;
import java.util.Map;

public class CollectionTask {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("apples", 4);
        map.put("bananas", 2);
        map.put("lemons", 3);

        printMap(map);
    }
}
