package se.iths.Forelasningar.notes.DemoArvPolymorfism;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        /*Circle circle2 = new Cylinder(5,10);
        Object object = new Circle(5);
        Object object2 = new Cylinder(5,10);*/
        Cylinder cylinder = new Cylinder(5,6);
        System.out.println(circle);
        System.out.println(cylinder);
    }
}
class Circle{
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius* Math.PI;
    }
    public String toString(){
        return "Radius = "+radius;
    }
}
class Cylinder extends Circle{
    float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2+2*radius*height*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString()+"\tHeight = "+height;
    }
}
