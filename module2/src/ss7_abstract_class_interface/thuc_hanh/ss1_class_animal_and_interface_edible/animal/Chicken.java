package ss7_abstract_class_interface.thuc_hanh.ss1_class_animal_and_interface_edible.animal;

import ss7_abstract_class_interface.thuc_hanh.ss1_class_animal_and_interface_edible.edible.InterfaceEdible;

public class Chicken extends Animal implements InterfaceEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    public String howToEat(){
        return "could be fried";
    }
}
