package ss7_abstract_class_interface.practice.practice2;

import ss6_inheritance.exercis.exercis1.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius(1)> o.getRadius(2)) return 1;
        else if (getRadius(2)<o.getRadius(3)) return -1;
        else return -1;
    }
}
