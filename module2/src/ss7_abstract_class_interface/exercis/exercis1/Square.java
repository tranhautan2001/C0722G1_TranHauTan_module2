package ss7_abstract_class_interface.exercis.exercis1;

public class Square implements Resizeable {
       private int edge = 3;

    public Square() {
    }

    public Square(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
    public double getArea() {
        return edge * edge;
    }

    public double getPerimeter() {
        return edge * 4 ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.edge+=this.edge*percent/100;
    }
}
