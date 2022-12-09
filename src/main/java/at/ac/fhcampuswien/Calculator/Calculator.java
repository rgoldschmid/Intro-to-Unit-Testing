package at.ac.fhcampuswien.Calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int pow(int base, int exp) {
        int result = 1;
        while (exp != 0) {
            result *= base;
            exp--;
        }
        return result;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Sorry, can't divide by zero!");
        }
        return a / b;
    }
}
