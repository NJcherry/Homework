package practice_5.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Owner Ann = new Owner();

        Ann.feedMyPet(dog);
        Ann.interactWithPet(dog);
        Ann.feedMyPet(cat);
        Ann.interactWithPet(cat);
    }
}
