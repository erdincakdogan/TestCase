package org.WorkerDetails;

import java.time.LocalDate;

public class WorkerCalculate {
    public static void main(String[] args) {
        Worker worker = new Worker("Mehmet", "5000", LocalDate.of(2005, 5, 15));
        String workingPeriod = worker.getWorkingPeriodString();
        System.out.println(worker.getFullName() + " has been working for " + workingPeriod);

    }
}
