package practice_7.homework.additional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberBox<T extends Number> {
    private List<T> numbers;

    public NumberBox() {
        this.numbers = (List<T>) new ArrayList<>(Arrays.asList(1, 2, 3, 4));
    }

    public double getSum(List<T> list) {
        double sum = 0.0;

        for (T element : list) {
            sum = sum + element.doubleValue();
        } return sum;
    }

    public static void main(String[] args) {
        NumberBox numberBox = new NumberBox();

        System.out.println(numberBox.getSum(numberBox.numbers));
    }
}
