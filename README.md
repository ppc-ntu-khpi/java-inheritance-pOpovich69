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
