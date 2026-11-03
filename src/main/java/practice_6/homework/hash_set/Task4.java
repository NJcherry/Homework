package practice_6.homework.hash_set;

import java.util.HashSet;
import java.util.Scanner;

public class Task4 {
    private HashSet<String> names;
    static Scanner scanner = new Scanner(System.in);

    public Task4() {
        this.names = new HashSet<>();

        names.add("Kate");
        names.add("Jack");
        names.add("Mary");
        names.add("Tom");
        names.add("Lisa");
        names.add("Mike");
    }

    public void checkNamesInList() {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (names.contains(name)) {
            System.out.println("Имя найдено");
        } else {
            System.out.println("Имя не найдено");
        }
    }

    public static void main(String[] args) {
        Task4 task = new Task4();

        task.checkNamesInList();
    }
}
