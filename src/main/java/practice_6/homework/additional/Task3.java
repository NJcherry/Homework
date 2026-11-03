package practice_6.homework.additional;

import java.util.HashMap;

public class Task3 {
    private HashMap<String, String> settings;

    public Task3() {
        this.settings = new HashMap<>();

        settings.put("volume", "50%");
        settings.put("brightness", "50%");
        settings.put("quality", "high");
    }

    public void printSettings(String setting) {
        String value = settings.get(setting);
        if (settings.containsKey(setting)) {
            System.out.println(value);
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Task3 settings = new Task3();

        settings.printSettings("quality");
        settings.printSettings("graphics");
    }
}
