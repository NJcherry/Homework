package practice_5.homework.task_1;

public class Bird extends Animal{
    public Bird(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Птица летает");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Чирик!");
    }
}
