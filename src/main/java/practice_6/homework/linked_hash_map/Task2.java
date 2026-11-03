package practice_6.homework.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Task2 {
    private LinkedHashMap<String, String> phoneBook;
    static Scanner scanner = new Scanner(System.in);

    public Task2() {
        this.phoneBook = new LinkedHashMap<>();

        phoneBook.put("Abby", "123456");
        phoneBook.put("Beth", "123457");
        phoneBook.put("Colin", "123425");
        phoneBook.put("Dale", "128656");
        phoneBook.put("Ellie", "158646");
    }

    public void findNumber() {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            String phone = phoneBook.get(name);
            System.out.println(phone);
        } else {
            System.out.println("Контакт не найден");
        }
    }

    public static void main(String[] args) {
        Task2 phoneBook = new Task2();

        phoneBook.findNumber();
    }
}
