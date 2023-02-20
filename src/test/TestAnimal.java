// Родительский класс "Животное"
class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " eating");
    }

    public void sleep() {
        System.out.println(name + " sleep");
    }
}

// Дочерний класс "Собака"
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public static void bark(Dog dog) {
        System.out.println(dog.getName() + " barks");
    }
}

// Пример использования классов
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5);
        animal.eat();
        animal.sleep();

        Dog dog = new Dog("Patron", 3, "Sheepdog");
        dog.eat();
        dog.sleep();
        Dog.bark(dog);

        System.out.println(dog.getName() + " - " + dog.getAge() + " years, breed: " + dog.getBreed());
    }
}