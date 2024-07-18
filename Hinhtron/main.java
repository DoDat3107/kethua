package Hinhtron;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "Red");
        System.out.println("Circle:");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(2.0, "Blue", 5.0);
        System.out.println("\nCylinder:");
        System.out.println(cylinder);
    }
}
