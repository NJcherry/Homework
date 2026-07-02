package practice_2;

public class Main {
    public static void main(String[] args) {
        Student petya = new Student(18, "Petya");

        petya.print();

        Student kolya = new Student(20, "Kolya");

        kolya.print();

        petya.setName("Anton");
        petya.print();

        kolya.setAge(21);
        kolya.print();
    }
}
