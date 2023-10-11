package se.iths.Uppgifter.Vecka6;

import java.util.*;
import java.util.stream.Collectors;

public class Uppgift1till14 {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();
        //Uppgift 1
        var salOver1_8M = employeeList.stream().filter(e -> e.salary() > 1800000).toList();
        //Uppgift 2
        var nrOfEmpl = employeeList.size();
        //Uppgift 3
        var maxSalEmpl = employeeList.stream().max(Comparator.comparingInt(Employee::salary));
        //Uppgift 4
        var minSalEmpl = employeeList.stream().min(Comparator.comparingInt(Employee::salary));
        //Uppgift 5
        var list = employeeList.stream().filter(e -> e.projects().size() >1).toList();
        //Uppgift 6
        List<Project> allProjects = employeeList.stream().map(Employee::projects).flatMap(Collection::stream).distinct().toList();
        //Uppgift 7
        var groupedByNrProjects = employeeList.stream().collect(Collectors.groupingBy(e -> e.projects().size()));
        groupedByNrProjects.forEach((e,f) -> System.out.println(e + " : "+f.stream().map(Employee::firstName).toList()));
        //Uppgift 8
        var allOver800K = employeeList.stream().allMatch(e -> e.salary() > 800000);
        //Uppgift 9
        var anyUnder1M = employeeList.stream().anyMatch(e -> e.salary() < 1000000);
        //Uppgift 10
        var sumOfSalary = employeeList.stream().mapToDouble(Employee::salary).sum();
        //Uppgift 11
        var sortedListBySalary = employeeList.stream().sorted(Comparator.comparing(Employee::salary));
        //Uppgift 12
        List<String> projectName = employeeList.stream().filter(Objects::nonNull).flatMap(e -> e.projects().stream()).map(Project::name).distinct().toList();
        //Uppgift 13
        var limitToFirst5 = employeeList.stream().limit(5);
        //Uppgift 14
        var skipFirst5 = employeeList.stream().skip(5);
    }
}
