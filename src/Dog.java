public class Dog extends Animal {
    private String breed;


    /**
     *
     * Dog
     *
     * @param name  the name
     * @param age  the age
     * @param breed  the breed
     * @return public
     */
    public Dog(String name, int age, String breed) {

        super(name, age);
        this.breed = breed;
    }


    /**
     *
     * Gets the breed
     *
     * @return the breed
     */
    public String getBreed() {

        return breed;
    }


    /**
     *
     * Bark
     *
     * @param dog  the dog
     */
    public static void bark(Dog dog) {

        System.out.println(dog.getName() + " barks");
    }
}
