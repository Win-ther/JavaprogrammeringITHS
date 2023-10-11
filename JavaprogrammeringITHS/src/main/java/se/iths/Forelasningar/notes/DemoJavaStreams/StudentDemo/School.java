package se.iths.Forelasningar.notes.DemoJavaStreams.StudentDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Arland","Salinas","arland@salinas@mailserver.com",10,List.of(new Course("Java",60))));
        students.add(new Student("Anders","Andersson","anderssonsmail@telia.com",12,List.of(new Course("Webdev",70), new Course("Java",60))));
        students.add(new Student("Gregor","Eisenhorn","eisenhorn.heresyseeker@imperium.gov",8,List.of(new Course("Cooking",30), new Course("Hammering",10))));
        students.add(new Student("Frodo","Baggins","theshire3@hotmail.com",3,List.of(new Course("Rock",50),new Course("Wood",21),new Course("Plank",30))));
        students.add(new Student("Jonas","Doe","jonasDoe@witnessprotectionprogram.com",0,List.of()));
        students.add(new Student("Joan","Ofark","joanofark@francemail.ouioui",25,List.of(new Course("Granite", 30),new Course("Sten", 5))));
        students.add(new Student("Greek","Man","tzatsikieater@oroboros.greek",17,List.of(new Course("21 pilots?", 32),new Course("Lady gaga", 70))));
        //Students with over 10pts
        int studentWith10ptsCount = (int) students.stream().filter(s -> s.credits() > 10).count();
        //Summa och statistik av alla studenters poäng istället för bara .sum där man får summan endast.
        IntSummaryStatistics totalCreditsStats = students.stream().mapToInt(Student::credits).summaryStatistics();
        //Unmodifiable ist of mailadresses from students.
        var listOfMailAdresses = students.stream().map(Student::email).toList();
        //Modifiable List of mailadresses from students.
        var modListMailAdress = students.stream().map(Student::email).collect(Collectors.toSet());
        //Get sorted full names from students
        List<String> fullNames = students.stream().map(s -> s.firstname() + " " + s.lastName()).sorted().toList();
        //Name and emailadress
        List<StudentNameAndEmail> studentNameAndEmailList = students.stream().map(StudentNameAndEmail::of).toList();
        //Students that have more than one cource
        int studentCourseOver1 = (int) students.stream().filter(s -> s.courseList().size() > 1).count();
        //list/set of unique coursenames ToDo: Applicera detta till uppgifterna istället för det jag har nu
        List<Course> courses = students.stream().map(Student::courseList).flatMap(Collection::stream).distinct().toList();
        //
        int javaStudents = (int) students.stream().filter(s -> s.courseList().stream().anyMatch(c -> c.name().equals("Java"))).count();
    }

}
record StudentNameAndEmail(String fullName, String email){
    public static StudentNameAndEmail of(Student student){
        return new StudentNameAndEmail(student.firstname() + " " + student.lastName(),student.email());
    }
}