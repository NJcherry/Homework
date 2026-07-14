package practice_3;

public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

    static double calculateCircleArea(double r) {
        return PI * (r * r);
    }

    static double calculateCircumference(double r){
        return 2 * PI * r;
    }

    static double calculateExponentialGrowth(double initialValue, double rate, double time) {
        double result = initialValue * Math.pow(E, rate * time);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Площадь круга: " + MathConstants.calculateCircleArea(8.0) + "\nДлина окружности: " + MathConstants.calculateCircumference(8.0) + "\nЭкспоненциальный рост: " + MathConstants.calculateExponentialGrowth(10.0, 2.5, 6.25));
    }
}
