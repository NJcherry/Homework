package practice_5.homework.task_1;

public class Animal implements Moveable, Soundable{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void move() {
        System.out.print("Животное передвигается: ");
    }

    @Override
    public void sound() {
        System.out.print("Издать звук: ");
    }
}
