package practice_2;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(6.0);

        circle.setRadius(8.0);

        double area = circle.calculateArea();

        double length = circle.calculateCircumference();

        System.out.println("Радиус: " + circle.radius + "\nПлощадь: " + area + "\nДлина: " + length);
    }
}
