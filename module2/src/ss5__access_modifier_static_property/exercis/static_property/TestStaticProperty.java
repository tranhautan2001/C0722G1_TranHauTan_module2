package ss5__access_modifier_static_property.exercis.static_property;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW","I8");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mescedes","Maybachs450");
        System.out.println(Car.numberOfCars);

    }
}
