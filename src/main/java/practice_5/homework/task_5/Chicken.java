package practice_5.homework.task_5;

public class Chicken extends FarmAnimal{
    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        System.out.println(name + ": ест зерно");
    }

    @Override
    public void care() {
        System.out.println(name + ": Поставить кормушку для зерна");
    }

    @Override
    public void produce() {
        System.out.println(name + ": Несет яйца");
    }
}
