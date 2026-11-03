package practice_7.homework.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public void checkEmail(String email) throws InvalidEmailException {
        String regex = "^[\\w.+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new InvalidEmailException("Невалидный email " + email);
        }
        System.out.println("Email валидный");
    }

    public static void main(String[] args) {
        Task4 task = new Task4();

        task.checkEmail("example@gmail.com");
        task.checkEmail("invalid-email-com");
    }
}
