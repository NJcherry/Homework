package practice_2;

public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    void setX(int newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Координаты: " + this.x + ", " + this.y);
    }

    public static void main(String[] args) {
        Point coordinates = new Point(15, 9);

        coordinates.print();

        coordinates.setX(10);

        coordinates.print();
    }
}
