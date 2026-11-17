package practice_8.homework.part_1;

import java.util.function.Predicate;

public class PredicateTask {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));
    }
}
