package practice_8.homework.part_1;

import java.util.function.Function;

public class FunctionTask {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();

        System.out.println(getLength.apply("текст"));
    }
}
