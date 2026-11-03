package practice_6.homework.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {
    private LinkedHashMap<String, Integer> people;

    public Task1() {
        this.people = new LinkedHashMap<>();

        people.put("Anna", 18);
        people.put("Alex", 12);
        people.put("Carmen", 18);
        people.put("Tom", 17);
        people.put("Sam", 18);
    }

    public void printPeople() {
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Task1 people = new Task1();

        people.printPeople();
    }
}
