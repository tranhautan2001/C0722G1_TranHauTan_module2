package ss4_classes_and_objects_in_java.class_buiding_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
