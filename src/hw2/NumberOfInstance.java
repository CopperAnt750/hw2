package hw2;

public class NumberOfInstance {

    private static int count;

    public static int getCount() {
        return count;
    }

    public NumberOfInstance() {
        count++;
    }
}
