package ss7_abstract_class_interface.practice.practice1.animal;

import ss7_abstract_class_interface.practice.practice1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return  "could be fried";
    }
}
