package practice_6.homework.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    private ArrayList<Integer> numbers;

    public Task2() {
        this.numbers = new ArrayList<>(Arrays.asList(1,5,4,6,10,3));
    }

    public void printEvenNumbers() {
        numbers.forEach(
                number -> {
                    if (number % 2 == 0) {
                        System.out.println(number);
                    }
                }
        );
    }

    public static void main(String[] args) {
        Task2 numbers = new Task2();

        numbers.printEvenNumbers();
    }
}
