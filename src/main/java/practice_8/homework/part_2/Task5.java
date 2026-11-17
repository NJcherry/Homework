package practice_8.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2 ,4);

        List<Integer> result = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
