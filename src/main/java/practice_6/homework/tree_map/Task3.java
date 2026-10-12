package practice_6.homework.tree_map;

import java.util.TreeMap;

public class Task3 {
    private TreeMap<Integer, String> employees;

    public Task3() {
        this.employees = new TreeMap<>();

        employees.put(10, "Alex");
        employees.put(12, "Jack");
        employees.put(23, "Tim");
        employees.put(34, "Mary");
        employees.put(75, "George");
    }

    public void getHigherId(Integer id) {
        Integer result = employees.higherKey(id);
        if (result != null) {
            System.out.println("Больший ID: " + result);
        } else {
            System.out.println("Большего ID не существует");
        }
    }

    public void getLowerId(Integer id) {
        Integer result = employees.lowerKey(id);
        if (result != null) {
            System.out.println("Меньший ID: " + result);
        } else {
            System.out.println("Меньшего ID не существует");
        }
    }

    public static void main(String[] args) {
        Task3 employees = new Task3();

        employees.getHigherId(115);
        employees.getLowerId(6);
    }
}
