package practice_5.homework.task_2;

public class Cat extends Pet{

    @Override
    public void feed() {
        super.feed();
        System.out.println("Влажный корм");
    }

    @Override
    public void intract() {
        super.intract();
        System.out.println("Играть");
    }
}
