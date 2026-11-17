package practice_7.homework.exceptions;

public class Task3 {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Невалидный возраст");
        } else {
            System.out.println("Возраст валидный");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Task3 task = new Task3();

        task.checkAge(15);
        task.checkAge(154);
    }
}
