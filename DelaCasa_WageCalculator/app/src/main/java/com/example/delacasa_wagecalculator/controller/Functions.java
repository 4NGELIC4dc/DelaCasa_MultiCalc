package com.example.delacasa_wagecalculator.controller;

public class Functions {

    public double solveOvertime(double hours){
        double overtime;
        if (hours > 8) {
            overtime = hours - 8;
        } else {
            overtime = 0;
        }
        return overtime;
    }
    public double solveWageRegular(String employeeType, double hours, double overtime){
        double regularWage;
        if (employeeType.equals("Regular")){
            regularWage = (hours - overtime) * 100;
        } else if (employeeType.equals("Probationary")){
            regularWage = (hours - overtime) * 90;
        } else {
            regularWage = (hours - overtime) * 75;
        }
        return regularWage;
    }
    public double solveWageOvertime(String employeeType, double overtime) {
        double overtimeWage;
        if (employeeType.equals("Regular")) {
            overtimeWage = overtime * 115;
        } else if (employeeType.equals("Probationary")) {
            overtimeWage = overtime * 100;
        } else {
            overtimeWage = overtime * 90;
        }
        return overtimeWage;
    }
    public double solveTotalWage(double regularWage, double overtimeWage) {
        return regularWage + overtimeWage;
    }
}
