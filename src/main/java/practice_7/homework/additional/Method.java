package practice_7.homework.additional;

import java.util.List;

public class Method {
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> animals = List.of("cat", "dog", "fox");
        printList(animals);

        List<Integer> numbers = List.of(1, 2, 3, 4);
        printList(numbers);
    }
}
