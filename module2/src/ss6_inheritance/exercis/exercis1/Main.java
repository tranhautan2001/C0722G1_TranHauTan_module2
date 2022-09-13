package ss6_inheritance.exercis.exercis1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        circle.setColor("red");
        circle.setRadius(8);
        cylinder.setRadius(6);
        cylinder.setHeight(4);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());


    }
}
