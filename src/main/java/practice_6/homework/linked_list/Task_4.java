package practice_6.homework.linked_list;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_4 {
    private LinkedList<Integer> numbers;

    public Task_4() {
        this.numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
    }

    public Integer calculateSum() {
        AtomicInteger sum = new AtomicInteger();

        numbers.forEach(
                number -> {
                    sum.set(sum.get() + number);
                }
        );
        return sum.get();
    }

    public static void main(String[] args) {
        Task_4 numbers = new Task_4();

        System.out.println(numbers.calculateSum());
    }
}
