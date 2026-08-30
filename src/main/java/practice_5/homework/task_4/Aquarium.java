package practice_5.homework.task_4;

public class Aquarium {
    private SeaCreature creature;

    public void addSeaCreature(SeaCreature creature) {
        System.out.println("Существо " + creature.name + " добавлено в аквариум.");
    }

    public void showBehaviour(SeaCreature creature) {
        creature.move();
    }
}
