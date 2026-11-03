package practice_7.homework.exceptions;

public class Task2 {
    public int divideNumbers(int a, int b) {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        Task2 task = new Task2();

        try {
            task.divideNumbers(8, 0);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }
}
