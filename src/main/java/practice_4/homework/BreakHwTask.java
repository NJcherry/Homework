package practice_4.homework;

import java.util.Scanner;

public class BreakHwTask {
    public static void main(String[] args) {
        //calculateSumBeforeNegative();

        //printNumbersWithoutDivisibleBy3();

        //printOnlyPositiveNumbers();

        stopProgram();
    }

    static Scanner scanner = new Scanner(System.in);

    public static void calculateSumBeforeNegative() {
        int sum = 0;
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number < 0) break;
            sum = sum + number;
            System.out.println("Сумма: " + sum);
        }
    }

    public static void printNumbersWithoutDivisibleBy3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printOnlyPositiveNumbers() {
            while (true) {
            int number = scanner.nextInt();
            if (number < 0) continue;
            if (number == 0) break;
            System.out.println(number);
        }
    }

    public static void stopProgram() {
        String input;

        while (true) {
            System.out.print("Введите команду: ");
            input = scanner.nextLine();
            if (input.equals("stop")) break;
        }
    }
}
