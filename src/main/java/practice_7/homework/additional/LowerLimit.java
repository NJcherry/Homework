package practice_7.homework.additional;

import java.util.ArrayList;
import java.util.List;

public class LowerLimit {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        addNumbers(numbers);
        System.out.println(numbers);
    }
}
