package test;

import domain.Dog;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog("Sobaka", 5, 13.5f, false);
        dog.ShowInfo();
        dog.Eat();
        dog.Play();
        dog.HaveDrink();
        dog.Move();
        dog.Sleep();
        dog.GetRoar();
    }
}
