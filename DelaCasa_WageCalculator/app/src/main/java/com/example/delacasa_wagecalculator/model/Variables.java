package com.example.delacasa_wagecalculator.model;

public class Variables {

    private double hours, overtime, regularWage, overtimeWage, totalWage;
    private String name,
            employeeType = "";
    public Variables() {
    }

    //getters
    public double getHours() {
        return hours;
    }
    public double getOvertime() {
        return overtime;
    }
    public double getRegularWage(){
        return regularWage;
    }
    public double getOvertimeWage(){
        return overtimeWage;
    }
    public double getTotalWage(){
        return totalWage;
    }
    public String getName(){
        return name;
    }
    public String getEmployeeType(){
        return employeeType;
    }

    //setters
    public void setHours(double hours){
        this.hours = hours;
    }
    public void setOvertime(double overtime){
        this.overtime = overtime;
    }
    public void setRegularWage(double regularWage){
        this.regularWage = regularWage;
    }
    public void setOvertimeWage(double overtimeWage){
        this.overtimeWage = overtimeWage;
    }
    public void setTotalWage(double totalWage){
        this.totalWage = totalWage;
    }
    public void setName(String name){
        this.name =  name;
    }
    public void setEmployeeType(String employeeType){
        this.employeeType = employeeType;
    }

}
