package se.iths.Uppgifter.Vecka6;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();
        // TODO: try implementing more queries against the List<Employee>


//        List all distinct project in non-ascending order.
        System.out.println();
        List<Project> projectList = employeeList.stream().map(Employee::projects).flatMap(Collection::stream).distinct().toList();
//        Print full name of any employee whose firstName starts with ‘A’.
        System.out.println();
        employeeList.stream().filter(e -> e.firstName().startsWith("A")).map(e -> e.firstName() + " " +e.lastName()).forEach(System.out::println);
//        List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)
        List<Employee> employeesStartIn2023 = employeeList.stream().filter(e -> e.id().startsWith("2023")).toList();
//        Sort employees based on firstName, for same firstName sort by salary.
        List<Employee> sortedEmployees = employeeList.stream().sorted(Comparator.comparing(Employee::firstName).thenComparingInt(Employee::salary)).toList();
//        Print names of all employee with 3rd highest salary. (generalise it for nth highest salary).
        System.out.println();
        int n = 3;
        int nSalary = employeeList.stream().sorted(Comparator.comparingInt(Employee::salary).reversed()).mapToInt(Employee::salary).distinct().skip(n-1).findFirst().orElse(0);
        employeeList.stream().filter(e -> e.salary() == nSalary).map(e-> e.firstName() + " " + e.lastName() + "-" + e.salary()).forEach(System.out::println);
//        Print list of all employee with min salary.
        System.out.println();
        int lowSalary = employeeList.stream().min(Comparator.comparingInt(Employee::salary)).orElseThrow().salary();
        employeeList.stream().filter(e -> e.salary() == lowSalary).forEach(System.out::println);
//        Count of total laptops assigned to the employees.
        int totalLaptops = employeeList.stream().mapToInt(Employee::totalLaptopsAssigned).sum();
//        Count of all projects with Robert Downey Jr as PM.
        long countRDJPM = employeeList.stream().flatMap(e -> e.projects().stream().filter(p -> p.projectManager().equals("Robert Downey Jr"))).distinct().count();
//        List of all projects with Robert Downey Jr as PM.
        List<Project> projectsWithRDJPM = employeeList.stream().flatMap(e-> e.projects().stream().filter(p -> p.projectManager().equals("Robert Downey Jr"))).distinct().toList();
//        List of all people working with Robert Downey Jr.
        List<Employee> employeesWorkingWithRDJ = employeeList.stream().filter(e -> e.projects().stream().anyMatch(p -> p.projectManager().equals("Robert Downey Jr"))).toList();
//        Create a map based on this data, they key should be the year of joining, and value should be list of all the employees who joined the particular year. (Hint : Collectors.toMap)

        //Map<Integer,List<Employee>> mapOfJoiningPerYear = employeeList.stream().collect(Collectors.toMap((e -> Integer.parseInt(e.id().substring(0,4))), e -> new ArrayList<>(List.of(e)),(list1,list2) -> {list1.addAll(list2); return list1;}));
        Map<Integer,List<Employee>> mapOfJoiningPerYear = employeeList.stream().collect(Collectors.groupingBy(e -> Integer.parseInt(e.id().substring(0,4))));
        System.out.println();
        for (var entry : mapOfJoiningPerYear.entrySet()) {
            System.out.println("Year: " + entry.getKey() + " Employees: "+ entry.getValue().stream().map(e -> e.firstName() + " " + e.lastName()).toList());
        }
//        Create a map based on this data, the key should be year of joining and value should be the count of people joined in that particular year. (Hint : Collectors.groupingBy())
        Map<Integer, Long> countMapJoiningPerYear = employeeList.stream().collect(Collectors.groupingBy(e -> Integer.parseInt(e.id().substring(0,4)), Collectors.counting()));
        System.out.println();
        for (var entry : countMapJoiningPerYear.entrySet()) {
            System.out.println("Year: " + entry.getKey() + " Employees: "+ entry.getValue());
        }
    }
}