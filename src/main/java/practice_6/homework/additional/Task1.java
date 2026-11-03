package practice_6.homework.additional;

import java.util.HashSet;

public class Task1 {
    private HashSet<Integer> ids;

    public Task1() {
        this.ids = new HashSet<>();

        ids.add(10);
        ids.add(11);
        ids.add(12);
        ids.add(13);
        ids.add(14);
    }

    public void findId(int id) {
        if (ids.contains(id)) {
            System.out.println("Пользователь найден");
        } else {
            System.out.println("Пользователь не найден");
        }
    }

    public static void main(String[] args) {
        Task1 ids = new Task1();

        ids.findId(17);
    }
}
