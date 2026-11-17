package practice_8.homework.part_3;

import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        boolean result = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(result);
    }
}
