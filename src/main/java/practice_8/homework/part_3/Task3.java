package practice_8.homework.part_3;

import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Integer result = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(result);
    }
}
