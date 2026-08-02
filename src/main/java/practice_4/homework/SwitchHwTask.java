package practice_4.homework;

import java.util.Scanner;

public class SwitchHwTask {
    public static void main(String[] args) {
        //System.out.println(printDayOfWeek());

        //System.out.println("Цена билета: " + printTicketPrice() + " руб.");

        //System.out.println(printLetterMark());

        //System.out.println(processCommand());

        System.out.println(calculateNumbers());
    }
    public static String printDayOfWeek() {
        Scanner scanner= new Scanner(System.in);

        String dayOfWeek = "";
        System.out.print("Введите номер дня: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }
        return dayOfWeek;
    }

    public static int printTicketPrice() {
        Scanner scanner= new Scanner(System.in);

        int ticketPrice = 0;
        System.out.print("Введите номер дня: ");
        int day = scanner.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5:
                ticketPrice = 300;
                break;
            case 6, 7:
                ticketPrice = 450;
        }
        return ticketPrice;
    }

    public static String printLetterMark() {
        Scanner scanner= new Scanner(System.in);

        String mark = "Несуществующая оценка";
        System.out.print("Введите количество баллов: ");
        int points = scanner.nextInt();
        if (points >= 90 && points <= 100) {
            mark = "A";
        } else if (points >= 80 && points <= 89) {
            mark = "B";
        } else if (points >= 70 && points <= 79) {
            mark = "C";
        } else if (points >= 60 && points <= 69) {
            mark = "D";
        } else if (points >= 0 && points < 60) {
            mark = "F";
        }
        return mark;
    }

    public static String processCommand() {
        Scanner scanner= new Scanner(System.in);

        String description = "";
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();
        switch (command) {
            case "start":
                description = "Система запущена";
                break;
            case "stop":
                description = "Система выключена";
                break;
            case "restart":
                description = "Перезапуск системы";
                break;
            case "status":
                description = "Статус системы";
                break;
            default:
                description = "Неизвестная команда";
        }
        return description;
    }

    public static int calculateNumbers() {
        Scanner scanner= new Scanner(System.in);

        int result = 0;
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите операцию: ");
        String operation = scanner.next();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Деление на 0 невозможно");
                    break;
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Неизвестный оператор");
                break;
        }
        return result;
    }
}
