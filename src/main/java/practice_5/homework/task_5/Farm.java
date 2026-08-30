package practice_5.homework.task_5;

public class Farm {
    private FarmAnimal animal;

    public void takeCare(FarmAnimal animal) {
        animal.care();
        animal.feed();
    }

    public void getProduct(FarmAnimal animal) {
        animal.produce();
    }
}
