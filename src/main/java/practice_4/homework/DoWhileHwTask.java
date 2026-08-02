package practice_4.homework;

import java.util.Scanner;

public class DoWhileHwTask {
    public static void main(String[] args) {
        //checkPositiveNumber();

        //checkPassword();

        //printNumbers();

        //exitProgram();

        countDigits();
    }

    public static void checkPositiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number <= 0) System.out.println("Число не является положительным");
        } while (number <= 0);

        System.out.println("Число положительное");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password = "qwerty";
        String input;

        do {
            System.out.print("Введите пароль: ");
            input = scanner.nextLine();
            if (!input.equals(password)) System.out.println("Неправильный пароль");
        } while (!input.equals(password));

        System.out.println("Авторизация успешна");
    }

    public static void printNumbers() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitProgram() {
        Scanner scanner = new Scanner(System.in);

        String command = "exit";
        String input;

        do {
            System.out.print("Введите команду: ");
            input = scanner.nextLine();
            if (input.equals(command)) break;
        } while (!input.equals(command));
    }

    public static void countDigits() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        do {
            if (number == 0) System.out.println("Число равно 0");
            number = number / 10;
            count++;
        } while (number != 0);

        System.out.println(count);
    }
}
