package Thuc_Hanh.LopAnimalVainterfaceEdible;

import thuc_hanh.LopAnimalVainterfaceEdible.animal.Animal;
import thuc_hanh.LopAnimalVainterfaceEdible.animal.Chicken;
import thuc_hanh.LopAnimalVainterfaceEdible.animal.Tiger;
import thuc_hanh.LopAnimalVainterfaceEdible.edible.Edible;
import thuc_hanh.LopAnimalVainterfaceEdible.fruit.Apple;
import thuc_hanh.LopAnimalVainterfaceEdible.fruit.Fruit;
import thuc_hanh.LopAnimalVainterfaceEdible.fruit.Orange;

public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = ( Chicken ) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
