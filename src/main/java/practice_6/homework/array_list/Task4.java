package practice_6.homework.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Task4 {
    private ArrayList<Integer> numbers;

    public Task4() {
        this.numbers = new ArrayList<>(Arrays.asList(5,8,9,12,3));
    }

    public void calculateSum() {
        AtomicInteger sum = new AtomicInteger();

        numbers.forEach(
                number -> {
                    sum.set(sum.get() + number);
                }
        );
        System.out.println("Сумма чисел равна: " + sum);
    }

    public static void main(String[] args) {
        Task4 numbers = new Task4();

        numbers.calculateSum();
    }
}
