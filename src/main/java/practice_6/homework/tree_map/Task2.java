package practice_6.homework.tree_map;

import java.util.TreeMap;

public class Task2 {
    private TreeMap<String, Integer> people;

    public Task2() {
        this.people = new TreeMap<>();

        people.put("Bob", 25);
        people.put("Henry", 21);
        people.put("Dan", 26);
        people.put("Sam", 25);
        people.put("Tom", 20);
    }

    public void findMin() {
        System.out.println(people.firstKey());
    }

    public void findMax() {
        System.out.println(people.lastKey());
    }

    public static void main(String[] args) {
        Task2 people = new Task2();

        people.findMin();
        people.findMax();
    }
}
