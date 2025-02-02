package Tamgiac;

public class Triangle {
    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getS() {
        return side1*side2*side3;
    }
    public double getV() {
        return side1+side2+side3;
    }
    @Override
    public String toString() {
        return "tam giac {" + side1 + ", " + side2 + ", " + side3 + " chu vi la: "+getV()+" dien tich la: "+ getS() + "}";
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(2.0, 4.0, 3.0);
        System.out.println(t1.toString());
    }
}
