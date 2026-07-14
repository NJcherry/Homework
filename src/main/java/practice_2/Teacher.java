package practice_2;

public class Teacher {
    String name, subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return this.name;
    }

    String getSubject() {
        return this.subject;
    }

    void setName(String newName) {
        this.name = newName;
    }

    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    void printInfo() {
        System.out.println("Имя: " + this.name + ", предмет: " + this.subject);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ms White", "English");

        teacher.printInfo();

        teacher.setSubject("German");

        teacher.printInfo();
    }
}
