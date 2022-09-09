package ss4_classes_and_objects_in_java.exercis.class_buiding_fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    @Override
    public String toString() {
        if (on){
            return "Fan{" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                     "fan is on" +
                    '}';
        }else {
            return "Fan{" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    "fan is off" +
                    '}';

        }

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
