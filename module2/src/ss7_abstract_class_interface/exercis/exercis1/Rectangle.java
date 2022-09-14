package ss7_abstract_class_interface.exercis.exercis1;

public class Rectangle implements Resizeable{
    private int width = 3;
    private int length = 5;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2 ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width+=this.width*percent/100;
        this.length+=this.length*percent/100;
    }
}
