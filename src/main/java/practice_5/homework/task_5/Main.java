package practice_5.homework.task_5;

public class Main {
    public static void main(String[] args) {
        FarmAnimal cow = new Cow("корова");
        FarmAnimal chicken = new Chicken("курица");
        Farm farm = new Farm();

        farm.takeCare(cow);
        farm.takeCare(chicken);
        farm.getProduct(cow);
        farm.getProduct(chicken);
    }
}
