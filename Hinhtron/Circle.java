package Hinhtron;

public class Circle {
    private double radius;
    private String color;
    public static double PI =3.14;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;

    }

    public double S(){
        return 2 * PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}
