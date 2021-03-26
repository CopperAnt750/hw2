package hw2;

public class Money {

    long hryvnias;
    byte kopeck;

    public Money(long hryvnias, byte kopeck) {
        this.hryvnias = hryvnias;
        this.kopeck = kopeck;
    }

    public static Money addMoney(Money m1, Money m2) {
        int temp = 0;
        byte resaultKopeck = 0;
        long resauliHryvnias = m1.hryvnias + m2.hryvnias;
        if (m1.kopeck + m2.kopeck < 100) {
            temp = m1.kopeck + m2.kopeck;
        } else {
            resauliHryvnias++;
            temp = (m1.kopeck + m2.kopeck) - 100;
            resaultKopeck = (byte) temp;
        }
        return new Money(resauliHryvnias, resaultKopeck);
    }

    public static Money subMoney(Money m1, Money m2) {
        long resauliHryvnias = m1.hryvnias - m2.hryvnias;
        byte resaultKopeck = 0;
        if (m1.kopeck >= m2.kopeck) {
            resaultKopeck = (byte) (m1.kopeck - m2.kopeck);
        } else {
            resauliHryvnias--;
            resaultKopeck = (byte) ((m1.kopeck + 100) - m2.kopeck);
        }
        return new Money(resauliHryvnias, resaultKopeck);
    }

    public static double moneyToDouble(Money m) {
        return (m.hryvnias * 100 + m.kopeck) / 100d;
    }

    public static Money moneyToMoney(double num) {
        long hryvnias = (long) num;
        byte kopeck = (byte) ((num % hryvnias) * 100);
        if (kopeck > 100) {
            hryvnias = kopeck / 100;
            kopeck -= hryvnias * 100;
        }
        return new Money(hryvnias, kopeck);
    }


    public static Money divisionOfSums(Money m1, Money m2) {
        double firstAmaout = m1.moneyToDouble(m1);
        double secondAmout = m2.moneyToDouble(m2);
        double result = firstAmaout / secondAmout;
        return moneyToMoney(result);
    }

    public static Money divisionDouble(Money m1, double number) {
        double resault = Money.moneyToDouble(m1) / number;
        return moneyToMoney(resault);
    }

    public static Money mul(Money m, double number) {
        double amout = Money.moneyToDouble(m) * number;
        return Money.moneyToMoney(amout);
    }

    public static String moneyCompare(Money m1, Money m2) {
        if (m1.moneyToDouble(m1) > m2.moneyToDouble(m2)) {
            return "First one is higher";
        } else if (m1.moneyToDouble(m1) < m2.moneyToDouble(m2)) {
            return "Second one is higher";
        }
        return "Thay are equal";
    }

    @Override
    public String toString() {
        return "Money{" +
                "hryvnias=" + hryvnias +
                ", kopeck=" + kopeck +
                '}';
    }
}