package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("Invalid date");
            return;
        }

        int daysInMonth;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
                break;
        }

        System.out.println(daysInMonth);
    }
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static void main(String[] args){
        DaysInMonth daysInMonth = new DaysInMonth();
        daysInMonth.printDays(2021, 2);    // output: 28
        daysInMonth.printDays(2024, 2);    // output: 29
        daysInMonth.printDays(2021, 4);    // output: 30
        daysInMonth.printDays(2021, 13);   // output: Invalid date
    }

}
