package ss7_abstract_class_interface.exercis.exercis2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle("blue",true, 10.0,16.0);
        shapes[1] = new Square("yellow",false,6.0);
        shapes[2] = new Circle("red", true,8.0);

        for (Shape shape : shapes){
            System.out.printf("Diện tích:" + shape.getArea());
            System.out.println();
            System.out.printf("Chu vi: %.2f", shape.getPerimeter());
            System.out.println();
            if (shape instanceof Shape){
                shape.howToColor();
            }
        }
    }
}
