package org.WorkerDetails;

import java.time.LocalDate;

public class WorkerCalculate {
    public static void main(String[] args) {
        Worker worker = new Worker("Mehmet", "5000", LocalDate.of(2010, 5, 15));
        int workingDay = worker.calculateWorkingDay();
        System.out.println(worker.getFullName() + " " + workingDay + " .");
    }
}
