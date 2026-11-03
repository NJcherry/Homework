package practice_6.homework.linked_list;

import java.util.LinkedList;

public class Task_2 {
    private LinkedList<String> tasks;

    public Task_2() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.addLast(task);
    }

    public String processNextTask() {
        return tasks.poll();
    }

    public void printTasks() {
        System.out.println("Задачи: " + tasks);
    }

    public static void main(String[] args) {
        Task_2 tasks = new Task_2();

        tasks.addTask("Помыть посуду");
        tasks.addTask("Постирать белье");
        tasks.addTask("Сходить в магазин");
        tasks.printTasks();

        while(!tasks.tasks.isEmpty()) {
            tasks.processNextTask();
            tasks.printTasks();
        }
    }
}
