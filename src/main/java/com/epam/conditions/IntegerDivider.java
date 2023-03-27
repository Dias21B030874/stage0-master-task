package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("Division by zero");
            return;
        }

        int quotient = dividend / divider;
        int product = quotient * divider;

        if (product == dividend) {
            System.out.println("Can be divided completely");
        } else {
            System.out.println("Cannot be divided completely");
        }
    }
    public static void main(String[] args){
        IntegerDivider integerDivider = new IntegerDivider();
        integerDivider.printCompletelyDivided(12, 3);    // output: Can be divided completely
        integerDivider.printCompletelyDivided(11, 3);    // output: Cannot be divided completely
        integerDivider.printCompletelyDivided(12, 0);    // output: Division by zero

    }

}
