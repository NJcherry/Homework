package practice_5.homework.task_3;

import practice_5.homework.task_2.Main;

public class MainCourse extends Dish{
    private double temperature;

    public MainCourse(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void showDescription() {
        System.out.println("Это горячее блюдо. Температура: " + this.temperature);
    }
}
