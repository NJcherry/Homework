package practice_6.homework.linked_list;

import java.util.LinkedList;

public class Task_3 {
    private LinkedList<String> words;

    public Task_3() {
        this.words = new LinkedList<>();

        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("cherry");
        words.add("kiwi");
    }

    public void printFirstElement() {
        if (!words.isEmpty()) {
            System.out.println(words.getFirst());
        }
    }

    public void printLastElement() {
        if (!words.isEmpty()) {
            System.out.println(words.getLast());
        }
    }

    public static void main(String[] args) {
        Task_3 words = new Task_3();

        words.printFirstElement();
        words.printLastElement();
    }
}
