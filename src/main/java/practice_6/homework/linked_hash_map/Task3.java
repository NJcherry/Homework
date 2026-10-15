package practice_6.homework.linked_hash_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    private LinkedHashMap<String, String> history;

    public Task3() {
        this.history = new LinkedHashMap<>();

        history.put("1", "Главная");
        history.put("2", "Магазин");
        history.put("3", "Одежда");
        history.put("4", "Обувь");
        history.put("5", "Шапки");
        history.put("6", "Игрушки");
        history.put("7", "Для дома");
        history.put("8", "Спорт");
        history.put("9", "Корзина");
    }

    public void addPage(String id, String pageName) {
        if (history.size() >= 10) {
            String firstKey = history.keySet().iterator().next();
            history.remove(firstKey);
        }
        history.put(id, pageName);
    }

    public void printHistory() {
        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Task3 history = new Task3();

        history.addPage("10", "Контакты");
        history.printHistory();
        history.addPage("11", "Покупки");
        history.printHistory();
    }
}
