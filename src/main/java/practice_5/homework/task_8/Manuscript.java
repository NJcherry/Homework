package practice_5.homework.task_8;

public class Manuscript extends Exhibit{
    @Override
    public void describe() {
        System.out.println("Древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("Контроль температуры и влажности");
    }
}
