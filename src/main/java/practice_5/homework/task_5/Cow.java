package practice_5.homework.task_5;

public class Cow extends FarmAnimal{

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println(name + ": ест траву");
    }

    @Override
    public void care() {
        System.out.println(name + ": Пасти на лугу");
    }

    @Override
    public void produce() {
        System.out.println(name + ": Дает молоко");
    }
}
