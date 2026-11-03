package practice_6.homework.hash_map;

import java.util.HashMap;

public class Task1 {
    private HashMap<String, Integer> people;

    public Task1() {
        this.people = new HashMap<>();

        people.put("Nick", 18);
        people.put("Nina", 19);
        people.put("Kate", 20);
        people.put("John", 21);
        people.put("Anna", 22);
    }

    public void printPeople() {
        people.entrySet().forEach(
                entry -> {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
        );
    }

    public static void main(String[] args) {
        Task1 people = new Task1();

        people.printPeople();
    }
}
