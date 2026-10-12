package practice_6.homework.tree_set;

import java.util.TreeSet;

public class Task3 {
    private TreeSet<Integer> numbers;

    public Task3() {
        this.numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(11);
        numbers.add(24);
    }

    public void getHigherNumber(int number) {
        Integer result = numbers.higher(number);
        if (result != null) {
            System.out.println("Большее число: " + result);
        }
    }

    public void getLowerNumber(int number) {
        Integer result = numbers.lower(number);
        if (result != null) {
            System.out.println("Меньшее число: " + result);
        }
    }

    public static void main(String[] args) {
        Task3 task = new Task3();

        task.getHigherNumber(10);
        task.getLowerNumber(1);
    }
}
