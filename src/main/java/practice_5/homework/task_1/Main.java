package practice_5.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant("слон");
        Animal bird = new Bird("птица");

        Zoo zoo = new Zoo();
        zoo.addAnimal(elephant);
        zoo.showBehaviour(elephant);
        zoo.addAnimal(bird);
        zoo.showBehaviour(bird);
    }
}
