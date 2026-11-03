package practice_6.homework.hash_map;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    private HashMap<String, Integer> people;
    static Scanner scanner = new Scanner(System.in);

    public Task2() {
        this.people = new HashMap<>();

        people.put("Nick", 18);
        people.put("Nina", 19);
        people.put("Kate", 20);
        people.put("John", 21);
        people.put("Anna", 22);
    }

    public void checkName() {
        System.out.println("Введите имя:");
        String input = scanner.nextLine();
        if (people.containsKey(input)) {
            Integer age = people.get(input);
            System.out.println("Имя найдено: " + input + " - " + age);
        } else {
            System.out.println("Имя не найдено");
        }
    }

    public static void main(String[] args) {
        Task2 people = new Task2();

        people.checkName();
    }
}
