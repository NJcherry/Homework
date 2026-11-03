package practice_6.homework.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    private ArrayList<Integer> numbers;

    public Task5() {
        this.numbers = new ArrayList<>(Arrays.asList(66,8,1,17,42));
    }

    public void findMax() {
        Integer max = Collections.max(numbers);

        System.out.println("Максимальное число: " + max);
    }

    public static void main(String[] args) {
        Task5 numbers = new Task5();

        numbers.findMax();
    }
}
