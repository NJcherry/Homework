package practice_6.homework.linked_hash_set;

import java.util.LinkedHashSet;

public class Task2 {
    void addUnique(LinkedHashSet<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
        }
    }

    public static void main(String[] args) {
        Task2 task = new Task2();

        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("math");
        words.add("biology");
        words.add("physics");
        words.add("English");
        words.add("chemistry");

        task.addUnique(words, "music");
        task.addUnique(words, "English");

        System.out.println(words);
    }

}
