package practice_3;

public class Company {
    static String companyName;
    final int employeeID;
    String employeeName;

    public Company(String name, int id){
        this.employeeName = name;
        this.employeeID = id;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + Company.companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    public static void main(String[] args) {
        Company olga = new Company("Ольга", 1);
        Company ivan = new Company("Иван", 2);
        Company anna = new Company("Анна", 3);

        Company.companyName = "Inovation";

        Company.printCompanyName();

        //olga.employeeID = 5;
    }
}
