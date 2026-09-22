package practice_5.homework.task_4;

public class Shark extends SeaCreature{
    public Shark(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Плавает быстро и агрессивно");
    }
}
