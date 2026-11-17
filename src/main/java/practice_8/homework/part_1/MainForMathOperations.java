package practice_8.homework.part_1;

public class MainForMathOperations {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;

        System.out.println(add.apply(2, 4));
        System.out.println(subtract.apply(12, 2));
        System.out.println(multiply.apply(5, 6));
        System.out.println(divide.apply(21, 3));

    }
}
