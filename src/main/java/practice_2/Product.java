package practice_2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double applyDiscount(double discount) {
        this.price = this.price - this.price * discount * 0.01;
        return this.price;
    }

    void printInfo() {
        System.out.println("Название товара: " + this.name + "\nЦена: " + this.price);
    }

    public static void main(String[] args) {
        Product product = new Product("Принтер", 5690.0);

        product.printInfo();

        product.setPrice(5500.0);

        product.printInfo();

        product.applyDiscount(10);

        product.printInfo();
    }
}
