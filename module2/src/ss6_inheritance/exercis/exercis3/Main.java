package ss6_inheritance.exercis.exercis3;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        MovablePoint movablePoint = new MovablePoint(1,2);
        System.out.println(point);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
