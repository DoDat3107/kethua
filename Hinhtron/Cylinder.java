package Hinhtron;



public class Cylinder extends Circle {
    private double hight;

   public Cylinder(double radius, String color,double hight) {
       super(radius,color);
       this.hight = hight;
   }

    public double V() {
        return PI * getRadius()* getRadius() * hight;
    }
    @Override
    public String toString() {
       return "Cylinder [ radius " + getRadius() + ", color " + getColor() + ", hight " + hight + " the tich " + V()+ " ]";
    }


}
