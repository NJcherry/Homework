package practice_7.homework.additional;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<Integer> numbers;

    public NumberBox() {
        this.numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    public double getSum(List<T> list) {
        double sum = 0.0;

        for (T element : list) {
            sum = sum + element.doubleValue();
        } return sum;
    }

    public static void main(String[] args) {
        NumberBox<Integer> numberBox = new NumberBox<>();

        System.out.println(numberBox.getSum(numberBox.numbers));
    }
}
