package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int ABSENT = 0;
        final int wagePerHr=20;
        final int WORKING_DAYS = 20;
        int totalWage=0;
        for (int day=1 ;day<=WORKING_DAYS;day++) {
            Random num = new Random();
            int present = num.nextInt(3);
//        System.out.println(present);
            int workingHrs = 0;

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
            }

            int Wages = wagePerHr * workingHrs;

            System.out.println("Day " + day + " wage is:" + Wages);
            totalWage += Wages;

        }
        System.out.println("Total Wage for a Month is: " + totalWage);
    }
}
