package Tamgiac;

public class Shape extends Triangle{
    private String color;
    public Shape(double side1, double side2,double side3 ,String color){
        super(side1,side2,side3);
        this.color=color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "tam giac {" + getSide1() + ", " + getSide2() + ", " + getSide3() + " co mau : "+ color+ " chu vi la: "+getV()+" dien tich la: "+ getS() + "}";
    }

    public static void main(String[] args) {
        Shape a =new Shape(4,3,5,"red");
        System.out.println(a.toString());
    }
}
