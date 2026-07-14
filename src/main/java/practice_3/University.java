package practice_3;

public class University {
    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newUniName) {
        universityName = newUniName;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void printStudentInfo() {
        System.out.println("Имя: " + this.studentName + ", ID: " + this.studentID + ", университет: " + universityName);
    }

    public static void main(String[] args) {
        University student1 = new University(11, "Mike");
        University student2 = new University(12, "John");
        University student3 = new University(13, "Kate");

        University.changeUniversityName("Oxford");
        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

    }
}
