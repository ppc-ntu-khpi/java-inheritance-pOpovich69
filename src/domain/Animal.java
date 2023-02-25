package domain;


/**
 * The class Abstract animal
 */
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

    /**
     *
     * Get name
     *
     * @return String
     */
    public String GetName(){

        return this.Name;
    }

    /**
     *
     * Get age
     *
     * @return int
     */
    public int GetAge(){

        return this.Age;
    }

    /**
     *
     * Set age
     *
     * @param age  the age
     */
    public void SetAge(int age){

        if(age > 0) {
            this.Age = age;
        }
        else System.out.println("Помилка! Вік не може бути менший за 1");
    }

    /**
     *
     * Get weight
     *
     * @return float
     */
    public float GetWeight(){

        return this.Weight;
    }

    /**
     *
     * Set weight
     *
     * @param weight  the weight
     */
    public void SetWeight(float weight){

        if(weight > 0.1f){
            this.Weight = weight;
        }
        else System.out.println("Помилка! Вага не може бути менший за 0.1");
    }
}
