package practice_6.homework.tree_set;

import java.util.TreeSet;

public class Task2 {
    private TreeSet<Integer> numbers;

    public Task2() {
        this.numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(15);
    }

    public void addNumber(int number) {
        if (!numbers.contains(number)) {
            numbers.add(number);
        }
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        Task2 task = new Task2();

        task.addNumber(5);
    }
}
