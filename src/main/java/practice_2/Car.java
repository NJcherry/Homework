package practice_2;

public class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
        return this.brand;
    }

    int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
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
