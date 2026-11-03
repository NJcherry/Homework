package practice_6.homework.linked_list;

import java.util.LinkedList;

public class Task_1 {
    private LinkedList<String> words;

    public Task_1() {
        this.words = new LinkedList<>();
        words.add("paper");
        words.add("pen");
        words.add("book");
        words.add("pencil");
        words.add("ruler");
    }

    public void printList() {
        System.out.println(words);
    }

    public static void main(String[] args) {
        Task_1 words = new Task_1();

        words.printList();
    }
}
