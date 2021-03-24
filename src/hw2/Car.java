package hw2;

public class Car {

    int speed = 0;

    public String startEngine() {
        return "Engine is working";
    }

    public String stopEngine() {
        return "Engine isn`t working";
    }

    public String go() {
        return "Car is moving";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
