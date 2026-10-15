package practice_6.homework.array_deque;

import java.util.ArrayDeque;

public class Task3 {
    private ArrayDeque<Integer> numbers;

    public Task3() {
        this.numbers = new ArrayDeque<>();

        numbers.push(55);
        numbers.push(46);
        numbers.push(83);
    }

    public void addFirstElement(int number) {
        numbers.addFirst(number);
    }

    public void addLastElement(int number) {
        numbers.addLast(number);
    }

    public void deleteFirstElement() {
        numbers.removeFirst();
    }

    public void deleteLastElement() {
        numbers.removeLast();
    }

    public void printNumbers() {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Task3 numbers = new Task3();

        numbers.addFirstElement(23);
        numbers.printNumbers();
        numbers.addLastElement(64);
        numbers.printNumbers();
        numbers.deleteFirstElement();
        numbers.printNumbers();
        numbers.deleteLastElement();
        numbers.printNumbers();
    }
}
