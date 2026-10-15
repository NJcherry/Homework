package practice_6.homework.additional;

import java.util.Stack;

public class Task7 {
    public boolean isValidBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char symbol : input.toCharArray()) {
            switch (symbol) {
                case '(', '{', '[' -> stack.push(symbol);
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Task7 task = new Task7();

        System.out.println(task.isValidBrackets("()"));
        System.out.println(task.isValidBrackets("([])"));
        System.out.println(task.isValidBrackets("{[()]}"));
        System.out.println(task.isValidBrackets("([)"));
        System.out.println(task.isValidBrackets("((("));
    }
}
