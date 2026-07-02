public class MathOperations {
    public static void main(String[] args) {
        int sum = add(2, 5);
        System.out.println("Результат сложения: " + sum);

        int sub = subtract(10, 6);
        System.out.println("Результат вычитания: " + sub);

        int mult = multiply(7, 3);
        System.out.println("Результат умножения: " + mult);

        double div = divide(63, 9);
        System.out.println("Результат деления: " + div);

        int max = findMax(84, 115);
        System.out.println("Максимальное значение: " + max);

        int diff = difference(-5, 2);
        System.out.println("Разница между числами: " + diff);

        int square = squareArea(6);
        System.out.println("Площадь квадрата: " + square);

        int perimeter = squarePerimeter(8);
        System.out.println("Периметр квадрата: " + perimeter);

        double minutes = convertSecondsToMinutes(30);
        System.out.println("Количество минут: " + minutes);

        double speed = averageSpeed(250.0, 2.25);
        System.out.println("Средняя скорость: " + speed);

        double hip = findHipotenuse(5, 7);
        System.out.println("Гипотенуза равна: " + hip);

        double length = circleCircumference(10);
        System.out.println("Длина окружности: " + length);

        double percent = calculatePercentage(200.0, 30.0);
        System.out.println("Процент составляет: " + percent);

        double fahr = celsiusToFahrenheit(100.0);
        System.out.println("Градусов Фаренгейта: " + fahr);

        double cels = fahrenheitToCelsius(100.0);
        System.out.println("Градусов Цельсия: " + cels);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int c, int d) {
        return c - d;
    }

    public static int multiply(int e, int f) {
        return e * f;
    }

    public static double divide(int g, int h) {
        return (double) g / h;
    }

    public static int findMax(int i, int j) {
        return Math.max(i, j);
    }

    public static int difference(int k, int l) {
        return Math.abs(k-l);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double)seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHipotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
