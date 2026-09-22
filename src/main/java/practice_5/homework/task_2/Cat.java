package practice_5.homework.task_2;

public class Cat extends Pet{

    @Override
    public void feed() {
        super.feed();
        System.out.println("Влажный корм");
    }

    @Override
    public void interact() {
        super.interact();
        System.out.println("Играть");
    }
}
