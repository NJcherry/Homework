package practice_5.homework.task_7;

public class RollerCoaster extends Attraction{
    @Override
    public void info() {
        super.info();
        System.out.println("Американские горки");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("Регулярная проверка безопасности");
    }
}
