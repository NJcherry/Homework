package practice_5.homework.task_2;

public class Dog extends Pet{

    @Override
    public void feed() {
        super.feed();
        System.out.println("Сухой корм");
    }

    @Override
    public void interact() {
        super.interact();
        System.out.println("Гулять");
    }
}
