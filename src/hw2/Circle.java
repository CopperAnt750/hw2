package hw2;

import static java.lang.Math.PI;

public class Circle {

    private static int instanceCount = 0;
    private double radius = 0;


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
        return PI * Math.pow(radius, 2);
    }
}
