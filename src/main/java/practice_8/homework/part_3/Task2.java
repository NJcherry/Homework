package practice_8.homework.part_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Integer result = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(result);
    }
}
