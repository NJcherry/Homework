package practice_8.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "orange", "plum", "apricot");

        List<String> result = words.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
