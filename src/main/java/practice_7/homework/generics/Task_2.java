package practice_7.homework.generics;

public class Task_2 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        String[] words = {"cat", "dog", "mouse"};
        Double[] prices = {15.99, 2.75, 45.5};

        printArray(numbers);
        printArray(words);
        printArray(prices);
    }
}
