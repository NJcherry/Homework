package practice_6.homework.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    private ArrayList<Integer> numbers;

    public Task1() {
        this.numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }

    public void addNumber(Integer number) {
        numbers.add(number);
    }

    public void printNumbers() {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Task1 numbers = new Task1();

        numbers.printNumbers();
        numbers.addNumber(6);
        numbers.printNumbers();
    }
}
