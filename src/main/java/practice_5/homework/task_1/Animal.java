package practice_5.homework.task_1;

public class Animal implements Moveable, Soundable{
    protected String name;

    @Override
    public void move() {
        System.out.print("Животное передвигается: ");
    }

    @Override
    public void sound() {
        System.out.print("Издать звук: ");
    }
}
