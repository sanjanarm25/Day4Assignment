package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    final int PART_TIME = 1;
    final int FULL_TIME = 2;
    final int ABSENT = 0;
    final int wagePerHr = 20;
    final int workingDays = 20;
    final int maxWorkingHrs = 100;
    int totalWage = 0;

    public int computeWage() {
        int workingHrs = 0;
        for (int day = 1; day <= workingDays; day++) {
            Random num = new Random();
            int present = num.nextInt(3);
            switch (present) {
                case FULL_TIME:
                    System.out.println("Employee is Full timer");
                    workingHrs = 16;
                    break;
                case PART_TIME:
                    System.out.println("Employee is Part timer");
                    workingHrs = 8;
                    break;
                case ABSENT:
                    System.out.println("employee is absent");
                    workingHrs = 0;
                    break;
            }
            int wages = wagePerHr * workingHrs;
            System.out.println("Day " + day + " wage is:" + wages);
            totalWage += wages;
        }
        return totalWage;
    }

    public static void main(String[] args) {
        EmployeeWageComputation empWage = new EmployeeWageComputation();
        int totalWage = empWage.computeWage();
        System.out.println("Total Wage for a Month is: " + totalWage);
    }


}
