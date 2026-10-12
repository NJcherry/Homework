package practice_6.homework.additional;

import java.util.HashMap;
import java.util.Scanner;

public class Task6 {
    private HashMap<String, String> phoneBook;
    static Scanner scanner = new Scanner(System.in);

    public Task6() {
        this.phoneBook = new HashMap<>();

        phoneBook.put("Anna", "123456");
        phoneBook.put("Tom", "124856");
        phoneBook.put("Beth", "1296546");
        phoneBook.put("Alex", "1426876");
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
        Task6 phoneBook = new Task6();

        phoneBook.findNumber();
    }
}
