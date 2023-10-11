package se.iths.Uppgifter.OOP.OvningsUppgift;

public abstract class Person {
    private String name;
    private int age;
    private String job;
    private float money;
    private Vehicle ownedVehicle;

    public Person(String name, int age, String job, float money) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.money = money;
        ownedVehicle = null;
    }

    public Person(String name, int age, String job, float money, Vehicle ownedVehicle) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.money = money;
        this.ownedVehicle = ownedVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void ageUp(){
        age++;
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public Vehicle getOwnedVehicle() {
        return ownedVehicle;
    }

    public void setOwnedVehicle(Vehicle ownedVehicle) {
        this.ownedVehicle = ownedVehicle;
    }
}
