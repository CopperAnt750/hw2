package hw2;

public class Circle {

    private static int instanceCount = 0;
    private double radius = 0;
    private static double PI = 3.14d;

    public static int getInstanceCount() {
        return instanceCount;
    }

    public Circle(double radius) {
        this.radius = radius;
        instanceCount++;
    }

    public Circle() {
        instanceCount++;
    }

    public static double calculateCircleSquare(double radius) {
        return PI * radius * radius;
    }
}
