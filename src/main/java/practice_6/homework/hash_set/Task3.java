package practice_6.homework.hash_set;

import java.util.*;

public class Task3 {
    public Set<String> removeDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();

        set.addAll(input);

        return set;
    }

    public static void main(String[] args) {
        Task3 task = new Task3();

        List<String> words = new ArrayList<>(Arrays.asList("cat", "dog", "cat", "fox", "dog"));

        System.out.println(task.removeDuplicates(words));
    }
}
