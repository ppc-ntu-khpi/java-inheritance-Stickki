

/**
 * The class Animal
 */
public class Animal {
    private String name;
    private int age;


    /**
     *
     * It is a constructor.
     *
     * @param name  the name
     * @param age  the age
     */
    public Animal(String name, int age) {

        this.name = name;
        this.age = age;
    }


    /**
     *
     * Gets the name
     *
     * @return the name
     */
    public String getName() {

        return name;
    }


    /**
     *
     * Gets the age
     *
     * @return the age
     */
    public int getAge() {

        return age;
    }


    /**
     *
     * Eat
     *
     */
    public void eat() {

        System.out.println(name + " eating");
    }


    /**
     *
     * Sleep
     *
     */
    public void sleep() {

        System.out.println(name + " sleep");
    }
}
