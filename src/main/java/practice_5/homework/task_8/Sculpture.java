package practice_5.homework.task_8;

public class Sculpture extends Exhibit{
    @Override
    public void describe() {
        System.out.println("Скульптура");
    }

    @Override
    public void preserve() {
        System.out.println("Регулярная реставрация");
    }
}
