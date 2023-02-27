import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * The class Test dog
 */
public class TestDog {
    @Test

/**
 *
 * Test get name
 *
 */
    public void testGetName() {

        Dog dog = new Dog("Buddy", 2, "Golden Retriever");
        assertEquals("Buddy", dog.getName());
    }

    @Test

/**
 *
 * Test get age
 *
 */
    public void testGetAge() {

        Dog dog = new Dog("Buddy", 2, "Golden Retriever");
        assertEquals(2, dog.getAge());
    }

    @Test

/**
 *
 * Test get breed
 *
 */
    public void testGetBreed() {

        Dog dog = new Dog("Buddy", 2, "Golden Retriever");
        assertEquals("Golden Retriever", dog.getBreed());
    }
}
