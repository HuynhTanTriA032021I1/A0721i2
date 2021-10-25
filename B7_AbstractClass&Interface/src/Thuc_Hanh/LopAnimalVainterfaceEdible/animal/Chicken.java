package Thuc_Hanh.LopAnimalVainterfaceEdible.animal;

import thuc_hanh.LopAnimalVainterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return null;
    }
}