package D2D3;

public class s3D extends s2D {
    private float z;

    public s3D() {

    }

    public s3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    @Override
    public String toString() {
        return "s3D: [ " + "x=" + getX() + ", y=" + getY() + " z=" + z + "]";
    }

    public static void main(String[] args) {
        s3D s3d = new s3D(4,3,1);
        System.out.println(s3d.toString());

    }
}
