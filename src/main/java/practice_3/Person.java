package practice_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSsn() {
        return this.ssn;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void printPersoninfo() {
        System.out.println("Имя: " + this.firstName + ", Фамилия: " + this.lastName + ", SSN: " + this.ssn);
    }

    public static void main(String[] args) {
        Person ivan = new Person("Иван", "Иванов", "123-45-6789");
        Person maria = new Person("Мария", "Смирнова", "123-45-6790");
        Person oleg = new Person("Олег", "Петров", "123-45-6791");

        ivan.setFirstName("Андрей");

        ivan.printPersoninfo();
        maria.printPersoninfo();
        oleg.printPersoninfo();
    }
}
