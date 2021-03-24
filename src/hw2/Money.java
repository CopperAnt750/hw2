package hw2;

public class Money {

    long hryvnias;
    byte kopeck;

    public Money(long hryvnias, byte kopeck) {
        this.hryvnias = hryvnias;
        this.kopeck = kopeck;
    }

    //    Реализовать сложение, вычитание, деление сумм,
//    деление суммы на дробное число, умножение на дробное число
//    и операции сравнения

    @Override
    public String toString() {
        return "Money{" +
                "hryvnias=" + hryvnias +
                ", kopeck=" + kopeck +
                '}';
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
            resaultKopeck = (byte) ((m1.kopeck+100)- m2.kopeck);
        }
        return new Money(resauliHryvnias, resaultKopeck);


    }
}
