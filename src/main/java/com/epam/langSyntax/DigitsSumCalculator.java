package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        if (number < 1000 || number > 9999) {
            throw new IllegalArgumentException("Number must be a 4-digit integer.");
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }

}
