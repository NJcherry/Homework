package practice_8.homework.part_3;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("апельсин", "банан", "яблоко", "груша", "батон");

        String result = String.valueOf(words.stream()
                .filter(s -> s.startsWith("б"))
                .findFirst());

        System.out.println(result);
    }
}
