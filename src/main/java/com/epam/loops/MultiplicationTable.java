package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input: Number must be positive.");
        } else {
            MultiplicationTable multiplicationTable = new MultiplicationTable();
            multiplicationTable.printTable(number);
        }

        scanner.close();
    }

}
