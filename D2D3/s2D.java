package D2D3;

public class s2D {
    private float x;
    private float y;

    public s2D() {

    }

    public s2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "s2D [x=" + x + ", y=" + y + "]";
    }

    public static void main(String[] args) {
        s2D s2d = new s2D(4,4);
        s2d.setXY(5,5);
        System.out.println(s2d.toString());
    }
}
