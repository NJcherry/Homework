package practice_4.homework;

import java.util.Scanner;

public class WhileHwTask {
    public static void main(String[] args) {
        //System.out.println(calculateFactorial());

        //printAllEvenNumbers();

        printReverseNumbers();
    }
    public static int calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

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
        Scanner scanner = new Scanner(System.in);

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
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}
