package practice_6.homework.hash_set;

import java.util.HashSet;

public class Task2 {
    private HashSet<Integer> numbers;

    public Task2() {
        this.numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
    }

    public void checkNumber(int number) {
        if (numbers.contains(number)) {
            System.out.println("Это число есть в наборе");
        } else {
            System.out.println("Такого числа нет в наборе");
        }
    }

    public static void main(String[] args) {
        Task2 numbers = new Task2();

        numbers.checkNumber(5);
        numbers.checkNumber(15);
    }
}
