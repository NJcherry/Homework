package practice_5.homework.task_7;

public class Attraction implements Informational, Maintainable{
    @Override
    public void info() {
       System.out.print("Описание: ");
    }

    @Override
    public void maintain() {
        System.out.print("Обслуживание: ");
    }
}
