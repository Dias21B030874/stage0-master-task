package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("It's not a triangle");
        }
    }
    public static void main(String[] args){
        TriangleValidator validator = new TriangleValidator();
        validator.validate(3, 4, 5);    // output: This is a valid triangle
        validator.validate(2, 3, 6);    // output: It's not a triangle
    }

}
