package org.WorkerDetails;

import java.time.LocalDate;
import java.time.Period;

public class Worker {

    private String fullName;
    private String salary;
    private LocalDate firstDay;

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

    public Worker(String fullName, String salary, LocalDate firstDay) {
        this.fullName = fullName;
        this.salary = salary;
        this.firstDay = firstDay;
    }

    public Period calculateWorkingPeriod() {
        LocalDate today = LocalDate.now();
        return Period.between(firstDay, today);
    }

    public String getWorkingPeriodString() {
        Period workingPeriod = calculateWorkingPeriod();
        int years = workingPeriod.getYears();
        int months = workingPeriod.getMonths();
        int days = workingPeriod.getDays();

        StringBuilder periodString = new StringBuilder();
        if (years > 0) {
            periodString.append(years).append(" year");
            if (years > 1) {
                periodString.append("s");
            }
            periodString.append(", ");
        }
        if (months > 0) {
            periodString.append(months).append(" month");
            if (months > 1) {
                periodString.append("s");
            }
            periodString.append(", ");
        }
        periodString.append(days).append(" day");
        if (days > 1) {
            periodString.append("s");
        }

        return periodString.toString();
    }
}
