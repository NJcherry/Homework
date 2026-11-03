package practice_6.homework.linked_hash_set;

import java.util.LinkedHashSet;

public class Task1 {
    private LinkedHashSet<String> words;

    public Task1() {
        this.words = new LinkedHashSet<>();

        words.add("cat");
        words.add("mouse");
        words.add("dog");
        words.add("sheep");
        words.add("horse");
    }

    public void printWords() {
        System.out.println(words);
    }

    public static void main(String[] args) {
        Task1 words = new Task1();

        words.printWords();
    }
}
