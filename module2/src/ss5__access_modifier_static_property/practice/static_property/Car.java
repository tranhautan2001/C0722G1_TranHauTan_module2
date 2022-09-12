package ss5__access_modifier_static_property.practice.static_property;

    public class Car {

        private String name;

        private String engine;



        public static int numberOfCars;



        public Car(String name, String engine) {

            this.name = name;

            this.engine = engine;

            numberOfCars++;

        }


    }

