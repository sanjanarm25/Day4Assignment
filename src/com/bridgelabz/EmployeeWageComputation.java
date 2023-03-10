package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    final int PART_TIME = 1;
    final int FULL_TIME = 2;
    final int ABSENT = 0;
    int wagePerHr;
    int workingDays;
    int maxWorkingHrs;

    public EmployeeWageComputation(int wagePerHr, int workingDays, int maxWorkingHrs) {
        this.wagePerHr = wagePerHr;
        this.workingDays = workingDays;
        this.maxWorkingHrs = maxWorkingHrs;
    }

    public int computeWage() {
        int workingHrs = 0;
        int totalWage = 0;
        int totalWorkingHrs = 0;

        for (int day = 1; day <= workingDays && totalWorkingHrs < maxWorkingHrs; day++) {
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
                    System.out.println("Employee is absent");
                    workingHrs = 0;
                    break;
            }
            totalWorkingHrs += workingHrs;
            int wages = wagePerHr * workingHrs;
            System.out.println("Day " + day + " wage is:" + wages);
            totalWage += wages;
        }

        return totalWage;
    }

    public static void main(String[] args) {
        EmployeeWageComputation company1 = new EmployeeWageComputation(20, 20, 100);
        int totalWage1 = company1.computeWage();
        System.out.println("Total Wage for Company 1 is: " + totalWage1);

        EmployeeWageComputation company2 = new EmployeeWageComputation(25, 22, 120);
        int totalWage2 = company2.computeWage();
        System.out.println("Total Wage for Company 2 is: " + totalWage2);
    }


}
