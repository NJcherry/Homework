package practice_8.homework.part_1;

import java.util.function.Consumer;

public class ConsumerTask {
    public static void main(String[] args) {
        Consumer<String> printString = s -> System.out.println(s);

        printString.accept("Привет");
    }
}
