package practice_5.homework.task_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public Menu() {
        this.dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void showDescription() {
        dishes.forEach(dish -> dish.showDescription());
    }
}
