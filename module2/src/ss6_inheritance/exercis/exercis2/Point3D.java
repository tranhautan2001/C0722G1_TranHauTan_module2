package ss6_inheritance.exercis.exercis2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setY(2);
        super.setX(6);
        this.z = z;
    }
    public float []getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
