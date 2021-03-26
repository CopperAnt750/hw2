package hw2;

public class numberOfInstance {

    private static int count;

    public static int getCount() {
        return count;
    }

    public numberOfInstance() {
        count++;
    }
}
