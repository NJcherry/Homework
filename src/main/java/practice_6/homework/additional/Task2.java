package practice_6.homework.additional;

import java.util.LinkedList;

public class Task2 {
    private LinkedList<String> tasks;

    public Task2() {
        this.tasks = new LinkedList<>();

        tasks.add("Прочитать книгу");
        tasks.add("Приготовить обед");
        tasks.add("Погулять с собакой");
        tasks.add("Посмотреть фильм");
    }

    public void processTask() {
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }

    public static void main(String[] args) {
        Task2 tasks = new Task2();

        tasks.processTask();
    }
}
