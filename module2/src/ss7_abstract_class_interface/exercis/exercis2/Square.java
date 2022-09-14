package ss7_abstract_class_interface.exercis.exercis2;

public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side ;
    }

    public double getPerimeter() {
        return side * 4 ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+ super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("cách tô màu: Color all four sides");
    }
}
