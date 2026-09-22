package practice_5.homework.task_2;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Owner ann = new Owner();

        ann.feedMyPet(dog);
        ann.interactWithPet(dog);
        ann.feedMyPet(cat);
        ann.interactWithPet(cat);
    }
}
