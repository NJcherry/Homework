package practice_6.homework.array_deque;

import java.util.ArrayDeque;

public class Task1 {
    private ArrayDeque<String> animals;

    public Task1() {
        this.animals = new ArrayDeque<>();

        animals.addLast("cat");
        animals.addLast("dog");
        animals.addLast("fox");
        animals.addLast("rabbit");
        animals.addLast("cow");
    }

    public void printWords() {
        System.out.println(animals);
    }

    public static void main(String[] args) {
        Task1 animals = new Task1();

        animals.printWords();
    }
}
