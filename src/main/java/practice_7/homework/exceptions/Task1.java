package practice_7.homework.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
