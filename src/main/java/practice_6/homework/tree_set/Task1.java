package practice_6.homework.tree_set;

import java.util.TreeSet;

public class Task1 {
    private TreeSet<Integer> numbers;

    public Task1() {
        this.numbers = new TreeSet<>();

        numbers.add(7);
        numbers.add(12);
        numbers.add(3);
        numbers.add(6);
        numbers.add(4);
    }

    public void printNumbers() {
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Task1 numbers = new Task1();

        numbers.printNumbers();
    }
}
