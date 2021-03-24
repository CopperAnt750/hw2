package hw2;

public class FractionalNumber {

    private long numerator;
    private short denominator;

    public FractionalNumber(long numerator, short denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static FractionalNumber add(FractionalNumber f1, FractionalNumber f2) {
        long resaultNumerator = (f1.numerator * f2.denominator) + (f2.numerator * f1.denominator);
        short resaultDenominator = (short) (f1.denominator * f2.denominator);
        return new FractionalNumber(resaultNumerator, resaultDenominator);
    }

    public static FractionalNumber sub(FractionalNumber f1, FractionalNumber f2) {
        long resaultNumerator = (f1.numerator * f2.denominator) - (f2.numerator * f1.denominator);
        short resaultDenominator = (short) (f1.denominator * f2.denominator);
        return new FractionalNumber(resaultNumerator, resaultDenominator);
    }

    public static FractionalNumber mul(FractionalNumber f1, FractionalNumber f2) {
        long resaultNumerator = f1.numerator * f2.numerator;
        short resaultDenominator = (short) (f1.denominator * f2.denominator);
        return new FractionalNumber(resaultNumerator, resaultDenominator);
    }

    public static FractionalNumber div(FractionalNumber f1, FractionalNumber f2) {
        long resaultNumerator = f1.numerator * f2.denominator;
        short resaultDenominator = (short) (f1.denominator * f2.numerator);
        return new FractionalNumber(resaultNumerator, resaultDenominator);
    }

    public static String compare(FractionalNumber f1, FractionalNumber f2) {
        FractionalNumber res = sub(f1, f2);
        if (res.numerator < 0 && res.denominator < 0) {
            return " First one is less";
        } else if (res.numerator > 0 & res.denominator > 0) {
            return " First one is higer";
        } else return "they are equal";

    }

    @Override
    public String toString() {
        return "FractionalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}

