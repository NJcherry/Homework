package practice_5.homework.task_2;

public class Pet implements Feedable, Interactable{
    @Override
    public void feed() {
        System.out.print("Покормить: ");
    }

    @Override
    public void intract() {
        System.out.print("Ухаживать: ");
    }
}
