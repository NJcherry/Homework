package practice_6.homework.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Task3 {
    private ArrayList<String> words;

    public Task3() {
        this.words = new ArrayList<>(Arrays.asList("cat", "rabbit", "giraffe", "elephant"));
    }

    public String findLongest() {
        String  longest = "";

        for (String word : words) {
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        return longest;
    }

    public void printLongest() {
        System.out.println("Самое длинное слово: " + findLongest());
    }

    public static void main(String[] args) {
        Task3 words = new Task3();

        words.printLongest();
    }
}
