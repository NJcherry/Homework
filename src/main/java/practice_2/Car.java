package practice_2;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    void print() {
        System.out.println("Бренд: " + this.brand + ", год: " + this.year);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", 2021);

        car.print();

        car.setYear(2026);

        car.print();
    }
}
