package practice_5.homework.task_1;

public class Zoo {
    public void addAnimal(Animal animal) {
        System.out.println("Животное " + animal.name + " добавлено в зоопарк.");
    }

    public void showBehaviour(Animal animal) {
        animal.move();
        animal.sound();
    }
}
