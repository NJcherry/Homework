package practice_5.homework.task_3;

public class Main {
    public static void main(String[] args) {
        MainCourse soup = new MainCourse(40.5);

        Menu menu = new Menu();
        menu.addDish(soup);
        menu.showDescription();

        Drink juice = new Drink(250);
        menu.addDish(juice);
        menu.showDescription();
    }
}
