package practice_5.homework.task_1;

public class Elephant extends Animal{
    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Слон ходит");
    }

    @Override
    public void sound() {
        super.sound();
        System.out.println("Ду-ду!");
    }
}
