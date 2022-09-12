package ss5__access_modifier_static_property.practice.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle accessModifier = new Circle();

        accessModifier.getRadius();
        System.out.println("bán kính hình tròn là: " + accessModifier.getRadius());
        accessModifier.getArea();
        System.out.println("diện tích hình tròn là: " + accessModifier.getArea());
    }
}
