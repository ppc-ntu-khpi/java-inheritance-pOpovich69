## Діаграма класів
<img src="https://github.com/ppc-ntu-khpi/java-inheritance-pOpovich69/blob/master/images/UML.jpg">

## Клас Animal
```java
package domain;

public abstract class Animal {

    protected String Name;
    protected int Age;
    protected float Weight;
    public boolean WantsToEat;

    public abstract void Eat();
    public abstract void HaveDrink();
    public abstract void Sleep();
    public abstract void GetRoar();
    public abstract void Move();

    public void ShowInfo(){
        System.out.println("Ім'я тварини: " + this.Name);
        System.out.println("Вік тварини: " + this.Age);
        System.out.println("Вага тварини: " + this.Weight);
        System.out.println("Тварина хоче їсти?: " + this.WantsToEat);
    }
    public String GetName(){
        return this.Name;
    }
    public int GetAge(){
        return this.Age;
    }
    public void SetAge(int age){
        if(age > 0) {
            this.Age = age;
        }
        else System.out.println("Помилка! Вік не може бути менший за 1");
    }
    public float GetWeight(){
        return this.Weight;
    }
    public void SetWeight(float weight){
        if(weight > 0.1f){
            this.Weight = weight;
        }
        else System.out.println("Помилка! Вага не може бути менший за 0.1");
    }
}
```
## Клас Dog який наслідує клас Animal
```java
package domain;

public class Dog extends Animal {

    public Dog(){
        this.Name = "Dog";
        this.Age = 1;
        this.Weight = 1.0f;
        this.WantsToEat = false;
    }
    public Dog(String name, int age, float weight, boolean wantsToEat){
        this.Name = name;
        this.SetAge(age);
        this.SetWeight(weight);
        this.WantsToEat = wantsToEat;
    }
    public void Play(){
        System.out.println("Собака грається...");
    }
    @Override
    public void Eat() {
        if(WantsToEat)
            System.out.println("Собака їсть...");
        else
            System.out.println("Собака не хоче їсти!");
    }
    @Override
    public void HaveDrink() {
        System.out.println("Собака п'є...");
    }
    @Override
    public void Sleep() {
        System.out.println("Собака спить...");
    }
    @Override
    public void GetRoar() {
        System.out.println("Гав гав");
    }
    @Override
    public void Move() {
        System.out.println("Собака рухається...");
    }
}
```
## Клас TestAnimal в якому знаходиться метод main
```java
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
```
## Результат
<img src="https://github.com/ppc-ntu-khpi/java-inheritance-pOpovich69/blob/master/images/done.png">
