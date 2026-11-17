package practice_8.homework.part_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Integer result = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(result);
    }
}
