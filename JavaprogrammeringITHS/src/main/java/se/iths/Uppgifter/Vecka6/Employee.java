package se.iths.Uppgifter.Vecka6;

import java.util.List;

public record Employee(String id, String firstName, String lastName, int salary, int totalLaptopsAssigned, List<Project> projects) {
}