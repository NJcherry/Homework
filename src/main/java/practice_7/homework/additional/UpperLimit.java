package practice_7.homework.additional;

import java.util.List;

public class UpperLimit {
    public static <T extends Number> void sum(List<T> list) {
        double sum = 0;
        for (T element : list) {
            sum = sum + element.doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<Double> prices = List.of(1.5, 2.0, 3.75, 4.25);

        sum(numbers);
        sum(prices);
    }
}
