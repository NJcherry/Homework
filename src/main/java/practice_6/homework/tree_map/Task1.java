package practice_6.homework.tree_map;

import java.util.Map;
import java.util.TreeMap;

public class Task1 {
    private TreeMap<String, Integer> scores;

    public Task1() {
        this.scores = new TreeMap<>();

        scores.put("Kate", 60);
        scores.put("John", 55);
        scores.put("Alice", 76);
        scores.put("Jane", 95);
        scores.put("Mark", 80);
    }

    public void printScores() {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Task1 scores = new Task1();

        scores.printScores();
    }
}
