package practice_6.homework.priority_queue;

import java.util.PriorityQueue;

public class Task1 {
    private PriorityQueue<Integer> numbers;

    public Task1() {
        this.numbers = new PriorityQueue<>();

        numbers.offer(4);
        numbers.offer(2);
        numbers.offer(9);
        numbers.offer(14);
        numbers.offer(23);
    }

    public void printNumbers() {
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }

    public static void main(String[] args) {
        Task1 numbers = new Task1();

        numbers.printNumbers();
    }
}
