package practice_2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return this.width;
    }

    int getHeight() {
        return this.height;
    }

    void setWidth(int newWidth) {
        this.width = newWidth;
    }

    int calculateArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 4);

        rectangle.setWidth(6);

        int area = rectangle.calculateArea();

        System.out.println("Площадь прямоугольника: " + area);
    }
}
