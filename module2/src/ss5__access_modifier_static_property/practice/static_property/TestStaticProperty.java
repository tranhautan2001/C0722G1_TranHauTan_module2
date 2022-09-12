package ss5__access_modifier_static_property.practice.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","I8");

        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Mercedes","MayBach S680");

        System.out.println(Car.numberOfCars);

    }
}
