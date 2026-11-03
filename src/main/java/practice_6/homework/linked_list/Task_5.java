package practice_6.homework.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Task_5 {
    private LinkedList<String> words;
    private ListIterator<String> it;

    public Task_5() {
        this.words = new LinkedList<>();

        words.add("table");
        words.add("chair");
        words.add("lamp");
        words.add("sofa");
        words.add("shelf");

        this.it = words.listIterator();
    }

    public void printWordsForwards() {
        System.out.println("Вперед:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void printWordsBackwards() {
        System.out.println("Назад:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    public static void main(String[] args) {
        Task_5 words = new Task_5();

        words.printWordsForwards();
        words.printWordsBackwards();
    }

}
