package practice_6.homework.additional;

import java.util.HashSet;

public class Task8 {
    private HashSet<String> uniqueWords = new HashSet<>();
    String text = "hello mum hello dad hello cat hello dog";
    String[] words = text.split(" ");

    public void addWord() {
        for (String word : words) {
            uniqueWords.add(word);
        }
    }

    public void printResults() {
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println("Количество уникальных слов: " + uniqueWords.size());
    }

    public static void main(String[] args) {
        Task8 words = new Task8();

        words.addWord();
        words.printResults();
    }
}
