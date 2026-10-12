package practice_6.homework.hash_map;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private HashMap<String, Integer> people;

    public Task3() {
        this.people = new HashMap<>();

        people.put("Nick", 18);
        people.put("Nina", 9);
        people.put("Kate", 12);
        people.put("John", 21);
        people.put("Anna", 22);
    }

    public void printUnderage(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 18) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Task3 people = new Task3();

        people.printUnderage(people.people);
    }
}
