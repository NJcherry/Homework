package practice_2;

public class Laptop {
    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    double getPrice() {
        return this.price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void printInfo() {
        System.out.println("Бренд: " + this.brand + ", цена: " + this.price + " руб.");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("ASUS", 42990.0);

        laptop.setPrice(39999.99);

        laptop.printInfo();
    }
}
