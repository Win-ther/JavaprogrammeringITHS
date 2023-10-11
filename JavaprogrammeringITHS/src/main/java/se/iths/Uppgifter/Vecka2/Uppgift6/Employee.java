package se.iths.Uppgifter.Vecka2.Uppgift6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Employee {
    private String name;
    private int salary;
    private final LocalDate EMPLOYEMENT_DATE;

    public Employee(String name, int salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.EMPLOYEMENT_DATE = employmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getEMPLOYEMENT_DATE() {
        return EMPLOYEMENT_DATE;
    }

    public String employementTime() {
        return employementTime(LocalDate.now());
    }

    public String employementTime(LocalDate date) {
        return Period.between(getEMPLOYEMENT_DATE(), date).toString();
}

    public String employementTime(String date) {
        try {
            LocalDate date2 = LocalDate.parse(date);
            return employementTime(date2);
        }catch(DateTimeParseException d){
            System.out.println("Incorrekt datum, returnerar tom sträng");
            return "";
        }
    }
}
