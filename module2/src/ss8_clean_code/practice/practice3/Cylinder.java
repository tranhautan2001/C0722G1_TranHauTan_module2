package ss8_clean_code.practice.practice3;

public class Cylinder {
    public static double getVolume(int radius, int height) {
        double baseArea =  getBaseArea(radius);
        double perimeter = getPreimeter(radius) ;
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPreimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
}
