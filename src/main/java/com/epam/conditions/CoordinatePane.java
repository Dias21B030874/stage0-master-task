package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Zero");
        }

    }
    public static void main(String[] args){
        CoordinatePane coordinatePlane = new CoordinatePane();
        coordinatePlane.printQuadrant(2, 3);     // output: First quadrant
        coordinatePlane.printQuadrant(-2, 3);    // output: Second quadrant
        coordinatePlane.printQuadrant(-2, -3);   // output: Third quadrant
        coordinatePlane.printQuadrant(2, -3);    // output: Fourth quadrant
        coordinatePlane.printQuadrant(0, 0);     // output: Zero

    }

}

