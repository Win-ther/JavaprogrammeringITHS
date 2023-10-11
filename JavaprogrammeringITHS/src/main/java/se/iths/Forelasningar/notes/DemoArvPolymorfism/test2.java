package se.iths.Forelasningar.notes.DemoArvPolymorfism;

import java.util.List;
import java.util.Objects;

public class test2 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        Object[] objects = {"hej",10};
        person.hash("hej",10);
        List.of(1,2,3,4);
        person.name = "Kalle";
        person2.name = "Kalle";

        if (person.equals(person2)){
            System.out.println("Same same...");
        }else
            System.out.println("Different");

        Employee employee = new Employee(30,new NoBoss());
        if(employee.getBoss() instanceof NoBoss){
            System.out.println("Has no boss");
        }
    }
}

class Person{
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public void hash(Object... values){
        for (var v: values) {
            System.out.println(v);
        }
    }
}
class NoBoss extends Person{
    public NoBoss() {
        this.name = "";
    }
}
class Employee extends Person{
    int salary;
    Person boss;

    public Person getBoss() {
        return boss;
    }

    public Employee(int salary, Person boss) {
        if(boss == null)
            throw new IllegalArgumentException("Cannot be null");
        this.salary = salary;
        this.boss = boss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary);
    }
}