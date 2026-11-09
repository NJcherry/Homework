package practice_7.homework.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data.txt")) {
            System.out.println("Файл успешно открыт");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при закрытии файла");
        }
    }
}
