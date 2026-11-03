package practice_6.homework.array_deque;

import java.util.ArrayDeque;

public class Task2 {
    private ArrayDeque<Integer> numbers;

    public Task2() {
        this.numbers = new ArrayDeque<>();

        numbers.push(5);
        numbers.push(8);
        numbers.push(2);
        numbers.push(6);
        numbers.push(14);
    }

    public void printNumbers() {
        while (!numbers.isEmpty()) {
            System.out.println(numbers.pop());
        }
    }

    public static void main(String[] args) {
        Task2 numbers = new Task2();

        numbers.printNumbers();
    }
}
