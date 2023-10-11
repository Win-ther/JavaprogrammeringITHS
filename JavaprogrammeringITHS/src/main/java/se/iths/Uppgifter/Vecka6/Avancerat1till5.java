package se.iths.Uppgifter.Vecka6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Avancerat1till5 {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

        //Uppgift 1
        List<Optional<Employee>> minAndMaxList = employeeList.stream().collect(Collectors.teeing(Collectors.maxBy(Comparator.comparing(Employee::salary)), Collectors.minBy(Comparator.comparing(Employee::salary)), List::of));
        //minAndMax.forEach(System.out::println);

        //Uppgift 2
        Map<String, List<EmployeeAndProjectName>> employeByProjectName = employeeList.stream().flatMap(employeeToEmployeeAndProjectName()).collect(Collectors.groupingBy(EmployeeAndProjectName::projectName));
        //employeByProjectName.entrySet().forEach(System.out::println);
        //Uppgift 3

        Map<String, Integer> salaryByProject = employeeList.stream().flatMap(employeeToEmployeeAndProjectName()).collect(Collectors.groupingBy(EmployeeAndProjectName::projectName, Collectors.summingInt(e -> e.employee.salary())));
        //salaryByProject.entrySet().forEach(System.out::println);

        //Uppgift 4
        Map<String, Optional<EmployeeAndProjectName>> maxSalBy= employeeList.stream().flatMap(employeeToEmployeeAndProjectName()).collect(Collectors.groupingBy(EmployeeAndProjectName::projectName, Collectors.maxBy(Comparator.comparing(e -> e.employee.salary()))));
        //maxSalBy.entrySet().forEach(System.out::println);

        //Uppgift 5
        Map<String, Set<String>> projectsByTeam = employeeList.stream().map(Employee::projects).flatMap(List::stream).distinct().collect(Collectors.groupingBy(Project::team, Collectors.mapping(Project::name, Collectors.toSet())));
        projectsByTeam.entrySet().forEach(System.out::println);
    }
    private static Function<Employee, Stream<? extends EmployeeAndProjectName>> employeeToEmployeeAndProjectName() {
        return employee -> employee.projects().stream().map(project -> new EmployeeAndProjectName(employee, project.name()));
    }
    record EmployeeAndProjectName(Employee employee, String projectName){}
}
