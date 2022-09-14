package ss7_abstract_class_interface.exercis.exercis2;

public class Rectangle extends Shape implements Colorable {
    private double width = 5;
    private double height = 6;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width) * 2 ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Cách tô màu : Rectangle ");
    }
}
