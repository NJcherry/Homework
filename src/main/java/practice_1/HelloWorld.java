package practice_1;

public class HelloWorld {
 //   static int a = 1;

    public static void main(String[] args) {
//        System.out.println("Привет, мир!");
//        System.out.println("Это Инесса!");
//        System.out.println(1 + 2);
//        System.out.println(3 + 5);
//        System.out.println("В поле а хранится " + a);
        int sum1 = sum(1,2);
        System.out.println("Результат сложения: " + sum1);

        int mult1 = multiply(3,2);
        System.out.println("Результат умножения: " + mult1);

        int subs1 = substract(10,3);
        System.out.println("Результат вычитания: " + subs1);

        double div1 = divide(3,2);
        System.out.println("Результат деления: " + div1);

        int max1 = findMax(65, 98);
        System.out.println("Максимальное число: " + max1);

        int dif1 = difference(-5, 2);
        System.out.println("Разница между числами: " + dif1);

        int sqArea = squareArea(6);
        System.out.println("Площадь квадрата: " + sqArea);

        int sqPerimeter = squareAPerimeter(6);
        System.out.println("Периметр квадрата: " + sqPerimeter);

        double minutes = convertSecondsToMinutes(30);
        System.out.println("Количество минут: " + minutes);

        double speed = averageSpeed(315.0, 2.5);
        System.out.println("Средняя скорость: " + speed);

        double hypotenuse = findHypotenuse(4.5, 5.0);
        System.out.println("Гипотенуза равна: " + hypotenuse);

        double circleLength = circleCircumference(5.5);
        System.out.println("Длина окружности равна: " + circleLength);

        double percent = calculatePercentage(100.0, 19.0);
        System.out.println("Процент составляет: " + percent);

        double fahr = celsiusToFahrenheit(100.0);
        System.out.println("Градусов Фаренгейта: " + fahr);

        double celsius = fahrenheitToCelsius(100.0);
        System.out.println("Градусов Цельсия: " + celsius);
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiply(int p, int k) {
        int mult = p * k;
        return mult;
    }

    public static int substract(int g, int l) {
        return g - l;
    }

    public static double divide(int s, int h) {
        return (double) s / h;
    }

    public static int findMax(int a, int b) {
        int maximum = Math.max(a, b);
        return maximum;
    }

    public static int difference(int w, int z) {
        return Math.abs(w-z);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squareAPerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
