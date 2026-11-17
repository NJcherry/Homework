package practice_8.homework.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Map<Object, List<Integer>> result = numbers.stream()
                .collect(Collectors.groupingBy(s -> s % 2 == 0));

        System.out.println(result);
    }
}
