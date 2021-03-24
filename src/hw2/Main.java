package hw2;

public class Main {
    public static void main(String[] args) {
        Circle crcl1 = new Circle();
        Circle crcl2 = new Circle(3);

        System.out.println(" Circle square is : " + Circle.calculateCircleSquare(5));
        System.out.println(" Quantity of instatnce circle is : " + Circle.getInstanceCount());

        Car car1 = new Car();
        car1.setSpeed(35);
        System.out.println(car1.go());
        System.out.println("Cars speed is: " + car1.getSpeed() + " kmh");

        FractionalNumber f1 = new FractionalNumber(3, (short) 4);
        FractionalNumber f2 = new FractionalNumber(1, (short) 3);

        System.out.println("Sum = " + FractionalNumber.add(f1, f2));
        System.out.println("Sub = " + FractionalNumber.sub(f1, f2));
        System.out.println("Mul = " + FractionalNumber.mul(f1, f2));
        System.out.println("Div = " + FractionalNumber.div(f1, f2));
        System.out.println("Res is  = " + FractionalNumber.compare(f1, f2));

        Money m1 = new Money(2, (byte) 60);
        Money m2 = new Money(2, (byte) 40);

        System.out.println("Sum = " + Money.addMoney(m1, m2));
        System.out.println("Sub = " + Money.subMoney(m1, m2));


    }
}
