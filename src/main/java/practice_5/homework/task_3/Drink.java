package practice_5.homework.task_3;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void showDescription() {
        System.out.println("Это напиток. Объем: " + this.volume);
    }
}
