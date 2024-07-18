package MoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setXY(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getXY() {
        return new float[]{xSpeed, ySpeed};
    }
    @Override
    public String toString() {
        return "MoveablePoint{" + " xSpeed= " + xSpeed + " , ySpeed= " + ySpeed + " x= "+ getX()+" y= "+getY() + " }";
    }
    public float move(){
        float x1 = getX() + xSpeed ;
        return x1 ;
    }
    public float move2(){
        float y1 = getY() + ySpeed ;
        return y1 ;
    }

    public static void main(String[] args) {
        MoveablePoint a = new MoveablePoint(2,3,3,1);
        System.out.println(a.toString());
        System.out.println(a.move());
        System.out.println(a.move2());
    }
}
