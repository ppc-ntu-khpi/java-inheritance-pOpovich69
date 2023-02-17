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
