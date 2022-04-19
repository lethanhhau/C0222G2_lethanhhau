package module2.ss7_abstract_class_interface.thuc_hanh.ss1_class_animal_and_interface_edible.animal;

import module2.ss7_abstract_class_interface.thuc_hanh.ss1_class_animal_and_interface_edible.edible.InterfaceEdible;

public class AnimalTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                InterfaceEdible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}