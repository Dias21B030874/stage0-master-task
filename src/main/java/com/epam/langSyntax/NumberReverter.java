package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        if (number < 100 || number > 999) {
            throw new IllegalArgumentException("Number must be a 3-digit integer.");
        }

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        int invertedNumber = ones * 100 + tens * 10 + hundreds;
        System.out.println("Reversed number: " + invertedNumber);
    }

}
