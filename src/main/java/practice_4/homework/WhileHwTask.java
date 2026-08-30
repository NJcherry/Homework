package practice_4.homework;

import java.util.Scanner;

public class WhileHwTask {
    public static void main(String[] args) {
        //System.out.println(calculateFactorial());

        //printAllEvenNumbers();

        printReverseNumbers();
    }

    static Scanner scanner = new Scanner(System.in);

    public static int calculateFactorial() {
        int result = 1;
        int i = 1;
        int n = scanner.nextInt();
        while (i <= n) {
            result = result * i;
            i++;
        }
        return result;
    }

    public static void printAllEvenNumbers() {
        int i = 1;
        int n = scanner.nextInt();
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printReverseNumbers() {
        int number = scanner.nextInt();
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
