package practice_5.homework.task_7;

public class Main {
    public static void main(String[] args) {
        Attraction carousel = new Carousel();
        Attraction rollerCoaster = new RollerCoaster();
        ThemePark themePark = new ThemePark();

        themePark.manageAttraction(carousel);
        themePark.manageAttraction(rollerCoaster);
    }
}
