package practice_8.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "mouse", "parrot", "elephant");

        List<Integer> result = words.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
