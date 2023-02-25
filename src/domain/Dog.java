package domain;


/**
 * The class Dog extends animal
 */
public class Dog extends Animal {


    /**
     *
     * Dog
     *
     */
    public Dog(){

        this.Name = "Dog";
        this.Age = 1;
        this.Weight = 1.0f;
        this.WantsToEat = false;
    }

    /**
     *
     * Dog
     *
     * @param name  the name
     * @param age  the age
     * @param weight  the weight
     * @param wantsToEat  the wants to eat
     */
    public Dog(String name, int age, float weight, boolean wantsToEat){

        this.Name = name;
        this.SetAge(age);
        this.SetWeight(weight);
        this.WantsToEat = wantsToEat;
    }

    /**
     *
     * Play
     *
     */
    public void Play(){

        System.out.println("Собака грається...");
    }
    @Override

/**
 *
 * Eat
 *
 */
    public void Eat() {

        if(WantsToEat)
            System.out.println("Собака їсть...");
        else
            System.out.println("Собака не хоче їсти!");
    }
    @Override

/**
 *
 * Have drink
 *
 */
    public void HaveDrink() {

        System.out.println("Собака п'є...");
    }
    @Override

/**
 *
 * Sleep
 *
 */
    public void Sleep() {

        System.out.println("Собака спить...");
    }
    @Override

/**
 *
 * Get roar
 *
 */
    public void GetRoar() {

        System.out.println("Гав гав");
    }
    @Override

/**
 *
 * Move
 *
 */
    public void Move() {

        System.out.println("Собака рухається...");
    }
}
