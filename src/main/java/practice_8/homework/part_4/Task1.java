package practice_8.homework.part_4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Mary", "Andrew", "Mike", "Kate");

        Map<Object, List<String>> result = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(result);
    }
}
