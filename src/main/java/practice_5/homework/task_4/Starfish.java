package practice_5.homework.task_4;

public class Starfish extends SeaCreature{
    public Starfish(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Ползает медленно");
    }
}
