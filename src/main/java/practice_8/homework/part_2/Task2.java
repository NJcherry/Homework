package practice_8.homework.part_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 10, 25, 27);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
