import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * The class Test animal
 */
public class TestAnimal {
    @Test

/**
 *
 * Test animal methods
 *
 */
    public void testAnimalMethods() {

        Animal animal = new Animal("Animal", 5);
        animal.eat();
        animal.sleep();
        assertEquals("Animal", animal.getName());
        assertEquals(5, animal.getAge());
    }

    @Test

/**
 *
 * Test dog methods
 *
 */
    public void testDogMethods() {

        Dog dog = new Dog("Patron", 3, "Sheepdog");
        dog.eat();
        dog.sleep();
        Dog.bark(dog);
        assertEquals("Patron", dog.getName());
        assertEquals(3, dog.getAge());
        assertEquals("Sheepdog", dog.getBreed());
    }


    /**
     *
     * Main
     *
     * @param args  the args
     */
    public static void main(String[] args) {

        TestAnimal test = new TestAnimal();
        test.testAnimalMethods();
        test.testDogMethods();
        System.out.println("All tests passed successfully!");
    }
}
