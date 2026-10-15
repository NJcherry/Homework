package practice_6.homework.hash_set;

import java.util.HashSet;

public class Task1 {
    private HashSet<Integer> numers;

    public Task1() {
        this.numers = new HashSet<>();

        numers.add(1);
        numers.add(2);
        numers.add(3);
        numers.add(4);
        numers.add(5);
    }

    public void printNumbers() {
        System.out.println(numers);
    }

    public static void main(String[] args) {
        Task1 numbers = new Task1();

        numbers.printNumbers();
    }
}
