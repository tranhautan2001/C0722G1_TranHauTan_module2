package ss7_abstract_class_interface.practice.practice3;

import ss6_inheritance.exercis.exercis1.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius(1) > c2.getRadius(2)) return 1;
        else if (c1.getRadius(2) < c2.getRadius(3)) return -1;
        else return 0;
    }
}

