package practice_4.homework;

import java.util.Scanner;

public class IfElseHwTask {
    public static void main(String[] args) {
        //System.out.println(defineNumber());

        //System.out.println(findMax());

        //System.out.println(giveMark());

        //System.out.println(checkParity());

        //System.out.println(makeDiscount());

        System.out.println(giveResult());
    }

    static Scanner scanner = new Scanner(System.in);

    public static String defineNumber() {
        String message = "";

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            message = "Число положительное";
        } else if (number < 0) {
            message = "Число отрицательное";
        } else {
            message = "Число равно нулю";
        }
        return message;
    }

    public static String findMax() {
        String message = "";
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        if (number1 == number2) {
            message = "Числа равны";
        } else {
            message = "Наибольшее число: " + Math.max(number1, number2);
        }
        return message;
    }

    public static String giveMark() {
        String description = "";
        System.out.print("Введите оценку: ");
        int mark = scanner.nextInt();
        if (mark == 5) {
            description = "Отлично";
        } else if (mark == 4) {
            description = "Хорошо";
        } else if (mark == 3) {
            description = "Удовлетворительно";
        } else if (mark == 2 || mark == 1) {
            description = "Неудовлетворительно";
        } else {
            description = "Несуществующая оценка";
        }
        return description;
    }

    public static String checkParity() {
        String parity = "Нечетное";
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    public static String makeDiscount() {
        String discount = "Без скидки";
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age < 18) {
            discount = "25%";
        } else if (age >= 65) {
            discount = "30%";
        }
        return discount;
    }

    public static String giveResult() {
        System.out.print("Введите количество баллов: ");
        String result = "Несуществующая оценка";
        int points = scanner.nextInt();
        if (points >= 90 && points <= 100) {
            result = "Отлично";
        } else if (points >= 75 && points <= 89) {
            result = "Хорошо";
        } else if (points >= 60 && points <= 74) {
            result = "Удовлетворительно";
        } else if (points >= 0 && points < 60) {
            result = "Неудовлетворительно";
        }
        return result;
    }
}
