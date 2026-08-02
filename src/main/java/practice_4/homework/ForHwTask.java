package practice_4.homework;

import java.util.Scanner;

public class ForHwTask {
    public static void main(String[] args) {
        //printNumbersDivisibleBy3();

        //System.out.println(printSumOfNumbers());

        //multiplyTable();

        //System.out.println(checkNumberIsPrime());

        printNumbersUpTo10();
    }
    public static void printNumbersDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int printSumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void multiplyTable() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
    }

    public static boolean checkNumberIsPrime() {
        Scanner scanner = new Scanner(System.in);

        boolean isPrime = true;
        int n = scanner.nextInt();
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void printNumbersUpTo10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
