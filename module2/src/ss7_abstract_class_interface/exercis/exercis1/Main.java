package ss7_abstract_class_interface.exercis.exercis1;

import ss7_abstract_class_interface.practice.practice2.ComparableCircle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(6);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Square(8);

        for (Resizeable resizeable : shapes){
            resizeable.resize(Math.floor(Math.random()*100+1));
            System.out.println(resizeable);
        }
    }
}
