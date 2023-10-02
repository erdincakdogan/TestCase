package org.WorkerDetails;

import java.time.LocalDate;
import java.time.Period;

public class Worker {


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    private String fullName;
    private String salary;
    private LocalDate firstDay;
    public Worker(String fullName, String salary, LocalDate firstDay) {
        this.fullName = fullName;
        this.salary = salary;
        this.firstDay = firstDay;
    }
    public int calculateWorkingDay (){
        LocalDate today = LocalDate.now();
        Period workingDay = Period.between(firstDay, today);
        return workingDay.getYears();
    }



}
