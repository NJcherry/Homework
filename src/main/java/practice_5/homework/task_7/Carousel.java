package practice_5.homework.task_7;

public class Carousel extends Attraction{

    @Override
    public void info() {
        super.info();
        System.out.println("Классическая карусель с лошадками");
    }

    @Override
    public void maintain() {
        super.maintain();
        System.out.println("Частое тех. обслуживание");
    }
}
