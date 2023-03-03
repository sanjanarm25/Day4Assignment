package com.bridgelabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee\n" +
                "Wage Computation\n" +
                "Program on Master Branch");
        Random num=new Random();
        int present = num.nextInt(3);
//        System.out.println(present);
        int workingHrs;

        if(present==1){
            System.out.println("Employee is Full timer");
            workingHrs=16;
        }else if(present==0) {
            System.out.println("Employee is Part timer");
            workingHrs=8;

        }else{
            System.out.println("employee is absent");
            workingHrs=0;
        }
        int wagePerHr=20;
        int DailyWages =wagePerHr*workingHrs;
        System.out.println("Daily employee wage is: " +DailyWages);

    }
}
