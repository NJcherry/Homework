package practice_5.homework.task_6;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();
        Garden garden = new Garden();

        garden.care(orchid);
        garden.care(cactus);
    }
}
