package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        System.out.println("Before swap: first = " + first + ", second = " + second);

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swap: first = " + first + ", second = " + second);()
    }
    public static void main(String[] args){
        BitwiseValuesSwap bitwiseValuesSwap = new BitwiseValuesSwap();
        bitwiseValuesSwap.swap(10, 20);

    }

}
