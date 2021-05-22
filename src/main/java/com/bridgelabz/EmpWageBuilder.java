package com.bridgelabz;

public class EmpWageBuilder {

    //CONSTANTS
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    int wagePrHr, maxHr, maxDay;
    String companyName;

    public EmpWageBuilder(String companyName, int wagePrHr, int maxHr, int maxDay) {
        this.companyName = companyName;
        this.wagePrHr = wagePrHr;
        this.maxHr = maxHr;
        this.maxDay = maxDay;
    }
    private int calculateEmpWage() {
        //VARIABLES
        int empHours;
        int dailyEmpWage;
        int empMonthlyWages = 0;
        int workingHours = 0;
        int workingDays = 0;

        //COMPUTATION

        while (  workingHours < maxHr && workingDays < maxDay )    {
            workingDays++;
            int empCheck = (int) (Math.random() * 10 ) % 3;
            switch (empCheck)  {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            workingHours += empHours;
            //EMPLOYEE WAGE COMPUTATION
            dailyEmpWage = empHours * wagePrHr;
            empMonthlyWages += dailyEmpWage;
        }
        return empMonthlyWages;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilder dMart = new EmpWageBuilder("dMart",20,100,20);
        System.out.println("Employee Wage for dMart: " + dMart.calculateEmpWage());
        EmpWageBuilder cg = new EmpWageBuilder("cg",10,50,10);
        System.out.println("Employee Wage for cg: " + cg.calculateEmpWage());


    }
}