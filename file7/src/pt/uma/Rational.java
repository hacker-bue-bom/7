package pt.uma;

import java.util.Objects;

public class Rational implements Comparable<Rational>{
    private int numerator;
    private int denominator;

    //constructor
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    //getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    //setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object banana) {
        if (this == banana) {
            return true;
        }
        if (banana == null || this.getClass() != banana.getClass()) {
            return false;
        }

        Rational rationalobj = (Rational) banana;
        return numerator == rationalobj.getNumerator() && denominator == rationalobj.getDenominator();
    };

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenominator());
    }

    @Override
    public int compareTo(Rational obj) {
        return numerator*obj.getDenominator() - denominator*obj.getNumerator();
    }
}
