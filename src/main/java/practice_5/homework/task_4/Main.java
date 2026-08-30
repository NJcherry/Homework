package practice_5.homework.task_4;

public class Main {
    public static void main(String[] args) {
        SeaCreature starfish = new Starfish("морская звезда");
        SeaCreature shark = new Shark("акула");
        Aquarium aquarium = new Aquarium();

        aquarium.addSeaCreature(shark);
        aquarium.showBehaviour(shark);
        aquarium.addSeaCreature(starfish);
        aquarium.showBehaviour(starfish);
    }
}
